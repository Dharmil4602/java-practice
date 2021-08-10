import java.util.Scanner;

public class multiplyFloat {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner s = new Scanner(System.in);
        float a, b, multiply = 1;

        System.out.print("Value Of a = ");
        a = s.nextFloat();
        System.out.print("Value Of b = ");
        b = s.nextFloat();

        multiply = a * b;
        System.out.println("Multiplication Of " + a + " * " + b + " = " + multiply);
    }
}
