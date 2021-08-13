import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("Hello");

        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Year: ");
        year = s.nextInt();

        if (year % 4 == 0)
        {
            System.out.println("This Is A Leap Year");
        }
        else
        {
            System.out.println("This Is Not A Leap Year");
        }

    }
}
