package Reflection.basicLevel.invokePrivateMethods;

import java.lang.reflect.Method;

public class Math {
    public static void main(String[] args) throws Exception {
        Calculator cl = new Calculator(2, 9);

        Method[] mycl =  cl.getClass().getDeclaredMethods();
        for(Method mt:mycl){
            if(mt.getName().equals("addition")){
                mt.invoke(mycl, 2, 6);
            }
        }
    }
}
