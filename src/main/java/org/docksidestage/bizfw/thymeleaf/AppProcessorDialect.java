package org.docksidestage.bizfw.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

/**
 * The thymeleaf dialect providing original processors from this example application.
 * @author subaru
 * @author jflute
 */
public class AppProcessorDialect extends AbstractProcessorDialect {

    public AppProcessorDialect(String name, String prefix, int processorPrecedence) {
        super(name, prefix, processorPrecedence);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> processors = new HashSet<>();
        processors.add(new FieldErrorsDialectProcessor());
        return processors;
    }
}
