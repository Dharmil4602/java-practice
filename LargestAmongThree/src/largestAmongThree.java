import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        System.out.println("Hello");

        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = s.nextInt();
        System.out.print("Enter Second Number: ");
        b = s.nextInt();
        System.out.print("Enter Third Number: ");
        c = s.nextInt();

        if (a>b)
        {
            if (a>c)
            {
                System.out.println(a + " Is Largest");
            }
            else
            {
                System.out.println(c + " Is Largest");
            }
        }
        else
        {
            if (b>c)
            {
                System.out.println(b + " Is Largest");
            }
            else
            {
                System.out.println(c + " Is Largest");
            }
        }
    }
}
