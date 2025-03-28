package Reflection.basicLevel.invokePrivateMethods;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    private int multiply(int a, int b){
        return a*b;
    }

    public int addition(int a, int b){
        return a+b;
    }
}
