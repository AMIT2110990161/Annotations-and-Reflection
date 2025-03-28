package Reflection.basicLevel.accessPrivateFeilds;

public class CatMe {
    private String name;
    int age;

    public CatMe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

