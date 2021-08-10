import java.util.Scanner;

public class printInteger {
    public static void main(String[] args) {
        System.out.println("Hello There");

        Scanner s = new Scanner(System.in);
        int x;
        System.out.print("Enter Number: ");

        x = s.nextInt();

        System.out.println("You Entered: " + x);
    }
}
