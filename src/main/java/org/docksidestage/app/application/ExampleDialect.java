package org.docksidestage.app.application;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

/**
 * @author subaru
 */
public class ExampleDialect extends AbstractProcessorDialect {
    protected ExampleDialect(String name, String prefix, int processorPrecedence) {
        super(name, prefix, processorPrecedence);
    }
    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        HashSet<IProcessor> processors = new HashSet<>();
        processors.add(new FieldErrorsDialectProcessor());
        return processors;
    }
}
