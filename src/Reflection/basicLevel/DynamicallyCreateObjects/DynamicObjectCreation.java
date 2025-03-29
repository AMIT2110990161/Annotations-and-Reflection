package Reflection.basicLevel.DynamicallyCreateObjects;

import java.lang.reflect.Method;

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method greetMethod = clazz.getMethod("greet");
        greetMethod.invoke(obj);
    }
}

