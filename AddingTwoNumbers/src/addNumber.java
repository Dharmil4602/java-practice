import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        System.out.println("Hello There");

        Scanner s = new Scanner(System.in);
        int a,b, sum = 0;
        System.out.print("Enter First Number, a = ");
        a = s.nextInt();
        System.out.println("a = " + a);
        System.out.print("Enter Second Number, b = ");
        b = s.nextInt();
        System.out.println("b = " + b);

       sum = a + b;
        System.out.println("Summation Of a + b is: " + sum);

    }
}
