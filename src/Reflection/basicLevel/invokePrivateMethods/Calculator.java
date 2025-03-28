package Reflection.basicLevel.invokePrivateMethods;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    private void multiply(int a, int b){
        System.out.println("Multiplication of two numbers : " + (a*b));
    }

    public void addition(){
        System.out.println("Addition of two numbers is : " + (a+b));
    }
}
