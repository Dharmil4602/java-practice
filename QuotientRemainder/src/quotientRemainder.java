import java.util.Scanner;

public class quotientRemainder {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner s = new Scanner(System.in);
        float a,b, quotient, remainder;
        System.out.print("Enter The Dividend: ");
        a = s.nextInt();
        System.out.print("Enter The Divisor: ");
        b = s.nextInt();

        quotient = a / b;
        System.out.println("Quotient Is: " + quotient);

        remainder = a % b;
        System.out.println("Remainder Is: " + remainder);

    }
}
