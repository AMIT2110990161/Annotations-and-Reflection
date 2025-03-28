package Reflection.basicLevel.accessPrivateFeilds;
import Cat .java;

import java.lang.reflect.Field;

public class GetPrivateFeilds {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("BhagdBilla", 2);
        Field[] catFeilds = myCat.getClass().getDeclaredFields();

        for(Field feild : catFeilds){
            if(feild.getName().equals("name")){
                feild.setAccessible(true);
                feild.set(myCat, "SidhaBilla");
            }
        }
        myCat.getName();
    }
}
