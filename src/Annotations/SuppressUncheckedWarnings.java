package Annotations;

import java.util.ArrayList;

public class SuppressUncheckedWarnings {
    @SuppressWarnings({"rawtypes"})
    public static void makeArray() {
        ArrayList li = new ArrayList();
    }

    public static void main(String[] args) {
        makeArray();
    }
}
