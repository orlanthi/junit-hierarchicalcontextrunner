package de.bechte.junit.runners.context.description;

import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;

import java.lang.annotation.Annotation;

/**
 * The {@link MethodDescriber} is responsible for creating the {@link Description} for a {@link FrameworkMethod}.
 */
public class MethodDescriber implements Describer<FrameworkMethod> {

    public Description describe(final FrameworkMethod method) {
        if (method == null)
            throw new IllegalArgumentException("Method must not be null!");

        final Class<?> declaringClass = method.getMethod().getDeclaringClass();
        final String methodName = method.getName();
        final Annotation[] annotations = method.getAnnotations();
        return Description.createTestDescription(declaringClass, methodName, annotations);
    }
}