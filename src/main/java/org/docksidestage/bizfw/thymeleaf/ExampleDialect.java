package org.docksidestage.bizfw.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

/**
 * @author subaru
 * @author jflute
 */
public class ExampleDialect extends AbstractProcessorDialect {

    public ExampleDialect(String name, String prefix, int processorPrecedence) {
        super(name, prefix, processorPrecedence);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        HashSet<IProcessor> processors = new HashSet<>();
        processors.add(new FieldErrorsDialectProcessor());
        return processors;
    }
}
