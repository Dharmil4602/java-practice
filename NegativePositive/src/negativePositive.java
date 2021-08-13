import java.util.Scanner;

public class negativePositive {
    public static void main(String[] args) {
        System.out.println("Hello");

        float num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        num = s.nextFloat();

        if (num == 0)
        {
            System.out.println("You Entered 0");
        }
        else if (num > 0)
        {
            System.out.println("You Entered Positive Number");
        }
        else
        {
            System.out.println("You Entered Negative Number");
        }
    }
}
