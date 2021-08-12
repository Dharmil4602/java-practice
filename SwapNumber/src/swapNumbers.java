import java.util.Scanner;

public class swapNumbers {

//    First Method
    public static void main(String[] args) {
        System.out.println("Hello");
        int a,b,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.print("First Number Is: ");
        a = s.nextInt();
        System.out.print("Second Number Is: ");
        b = s.nextInt();

        System.out.println("Before Swapping Numbers Are: " + a + " " + b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping Numbers Are: " + a + " " + b);

        System.out.println(" ");

        // Second Method:

        int c,d;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter First Number For Second Method: ");
        c = n.nextInt();
        System.out.print("Enter Second Number For Second Method: ");
        d = n.nextInt();

        System.out.println("Before Swap: " + c + " " + d);

        c = c - d;
        d = c + d;
        c = d - c;
        System.out.println("After Swap: " + c + " " + d);
    }
}
