package org.docksidestage.bizfw.thymeleaf;

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
 * errors tag of field, which can show user messages. <br>
 * 
 * For example, if you put below element...
 * <pre>
 * &lt;p ex:ferrors="*{xxx}"&gt;&lt;/p&gt;
 * </pre>
 *
 * next elements be rendered.
 * <pre>
 * &lt;ul&gt;
 *     &lt;li th:each="e : ${#fields.detailedErrors('xxx')}" th:class="errors"&gt;
 *         &lt;span th:text="${e.message}">&lt;/span&gt;
 *     &lt;/li&gt;
 * &lt;/ul&gt;
 * </pre>
 *
 * <p>type of element you specify be ignored, this processor just focuses on attribute, 'ex:error'</p>
 * 
 * <p>[補足] LastaFluteの la:errors に近い機能。DBFluteとは無関係。</p>
 * @author subaru
 * @author jflute
 */
public class FieldErrorsDialectProcessor extends AbstractAttributeTagProcessor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // ex:ferrors
    private static final String DIALECT_PREFIX = "ex";
    private static final String ATTRIBUTE_NAME = "ferrors";

    // parsing e.g. "*{xxx}"
    private static final Pattern valueVariablePattern = Pattern.compile("\\*\\{(.*)}");

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected FieldErrorsDialectProcessor() {
        super(TemplateMode.HTML, DIALECT_PREFIX, /*elementName*/null, /*prefixElementName*/false, ATTRIBUTE_NAME,
                /*prefixAttributeName*/true, /*precedence*/100000, /*removeAttribute*/true);
    }

    // ===================================================================================
    //                                                                             Process
    //                                                                             =======
    @Override
    protected void doProcess(ITemplateContext context, IProcessableElementTag tag, AttributeName attributeName, String attributeValue,
            IElementTagStructureHandler structureHandler) {
        Matcher matcher = valueVariablePattern.matcher(attributeValue);
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

        structureHandler.replaceWith(model, /*processable*/true);
    }

    private IOpenElementTag createLiTag(IModelFactory modelFactory, String fieldValue) {
        IOpenElementTag liTag = modelFactory.createOpenElementTag("li");
        liTag = modelFactory.setAttribute(liTag, "th:each", String.format("e : ${#fields.detailedErrors('%s')}", fieldValue));
        liTag = modelFactory.setAttribute(liTag, "class", "errors");
        return liTag;
    }
}
