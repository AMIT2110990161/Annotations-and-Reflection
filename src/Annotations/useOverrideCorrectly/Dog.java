package Annotations.useOverrideCorrectly;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog is making sound");
    }
}
