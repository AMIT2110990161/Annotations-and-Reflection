package Reflection.basicLevel.invokePrivateMethods;

import java.lang.reflect.Method;

public class Math {
    public static void main(String[] args) throws Exception {
        Calculator cl = new Calculator(2, 9);

        Method[] mycl =  cl.getClass().getDeclaredMethods();
        for(Method mt:mycl){
            if(mt.getName().equals("multiply")){
                mt.setAccessible(true);
                mt.invoke(cl, 2, 6);
            }
        }
    }
}
