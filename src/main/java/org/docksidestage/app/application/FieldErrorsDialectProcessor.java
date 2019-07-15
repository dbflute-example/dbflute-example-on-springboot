package org.docksidestage.app.application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IOpenElementTag;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * Example:
 * if you put below element,
 * # <p ex:ferrors="*{xxx}"></p>
 *
 * next elements be rendered.
 * # <ul>
 * #     <li th:each="e : ${#fields.detailedErrors('xxx')}" th:class="errors">
 * #         <span th:text="${e.message}"></span>
 * #     </li>
 * # </ul>
 *
 * type of element you specify be ignored, this processor just focuses on attribute, 'ex:error'
 *
 * @author subaru
 */
public class FieldErrorsDialectProcessor extends AbstractAttributeTagProcessor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static Pattern pattern = Pattern.compile("\\*\\{(.*)}");

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected FieldErrorsDialectProcessor() {
        super(TemplateMode.HTML, "ex", null, false, "ferrors", true, 100000, true);
    }

    // ===================================================================================
    //                                                                             Process
    //                                                                             =======
    @Override
    protected void doProcess(ITemplateContext context, IProcessableElementTag tag, AttributeName attributeName, String attributeValue,
            IElementTagStructureHandler structureHandler) {
        Matcher matcher = pattern.matcher(attributeValue);
        if (!matcher.find()) {
            return;
        }
        String fieldValue = matcher.group(1);

        IModelFactory modelFactory = context.getModelFactory();
        IModel model = modelFactory.createModel();
        model.add(modelFactory.createOpenElementTag("ul", "th:if", String.format("${#fields.hasErrors('%s')}", fieldValue)));
        model.add(createLiTag(modelFactory, fieldValue));
        model.add(modelFactory.createOpenElementTag("span", "th:text", "${e.message}"));
        model.add(modelFactory.createCloseElementTag("span"));
        model.add(modelFactory.createCloseElementTag("li"));
        model.add(modelFactory.createCloseElementTag("ul"));

        structureHandler.replaceWith(model, true);
    }

    private IOpenElementTag createLiTag(IModelFactory modelFactory, String fieldValue) {
        IOpenElementTag liTag = modelFactory.createOpenElementTag("li");
        liTag = modelFactory.setAttribute(liTag, "th:each", String.format("e : ${#fields.detailedErrors('%s')}", fieldValue));
        liTag = modelFactory.setAttribute(liTag, "class", "errors");
        return liTag;
    }
}
