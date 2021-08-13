import java.util.Scanner;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        System.out.println("Hello");
        int num, sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number You Want Summation Upto: ");
        num = s.nextInt();

        sum = (num * (num + 1)) / 2;
        System.out.println("Summation Of First " + num + " Numbers Is: " + sum);
    }
}
