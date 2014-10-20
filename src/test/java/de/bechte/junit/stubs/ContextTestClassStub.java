package de.bechte.junit.stubs;

import org.junit.Test;

import static org.junit.Assert.fail;

public class ContextTestClassStub {
    public class A {
        @Test
        public void innerTestMethod() throws Exception {
        }
        public String doIt() { return getIt(); };
    }

    public class B {
        public String doIt() { return getIt(); };
        public class C {
            @Test
            public void failingTestMethod() throws Exception {
                fail("Failing!");
            }
            public String doIt() { return getIt(); };
        }
    }

    @Test
    public void outerTestMethod() throws Exception {
    }
    public String getIt() { return "ContextTestClassStub"; };
}
