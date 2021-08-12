import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Hello");
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        num = s.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Number Is Even..!!!");
        }
        else
        {
            System.out.println("Number Is Odd.....!!!");
        }
    }
}
