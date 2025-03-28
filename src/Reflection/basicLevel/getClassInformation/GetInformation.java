package Reflection.basicLevel.getClassInformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetInformation {
    public static  void main(String[] args) {
        Cat myCat = new Cat("BhagadBilla", 2);

        Field[] catFields = myCat.getClass().getDeclaredFields();
        for(Field fields : catFields){
            System.out.println(fields.getName());
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for(Method method:catMethods){
            System.out.println(method.getName());
        }

        Constructor<?>[] catConstructors = myCat.getClass().getDeclaredConstructors();
        for(Constructor<?> constructor:catConstructors){
            System.out.println(constructor.getName());
        }
    }
}
