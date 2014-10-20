package de.bechte.junit.stubs;

import org.junit.Test;

public class InheritedContextTestClassStub extends ContextTestClassStub {
    public class I {
        public String doIt() { return getIt(); };
        @Test
        public void innerTestMethod() throws Exception {
        }
    }

    @Test
    public void outerTestMethod() throws Exception {
    }
    
    public String getIt() { return "InheritedContextTestClassStub"; };
}