package Annotations.suppressUncheckedWarnings;

import java.util.ArrayList;

class SuppressWarningExample {
    @SuppressWarnings("unchecked")
    void demo() {
        ArrayList list = new ArrayList(); // No generics used
        list.add("Test");
        System.out.println(list.get(0));
    }
}

