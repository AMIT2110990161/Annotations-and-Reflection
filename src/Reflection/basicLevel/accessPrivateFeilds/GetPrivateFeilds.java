package Reflection.basicLevel.accessPrivateFeilds;

import java.lang.reflect.Field;

public class GetPrivateFeilds {
    public static void main(String[] args) throws Exception {
        CatMe myCat = new CatMe("BhagdBilla", 2);
        Field[] catFeilds = myCat.getClass().getDeclaredFields();

        for(Field feild : catFeilds){
            if(feild.getName().equals("name")){
                feild.setAccessible(true);
                feild.set(myCat, "SidhaBilla");
            }
        }
        System.out.println(myCat.getName());
    }
}
