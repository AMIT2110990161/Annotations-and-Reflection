package Annotations.useOverrideCorrectly;

public class Animal {
    public void makeSound(){
        System.out.println("Animal is making sound");
    };

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}

