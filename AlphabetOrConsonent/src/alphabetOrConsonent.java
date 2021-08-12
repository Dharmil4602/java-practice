import java.util.Scanner;

public class alphabetOrConsonent {
    public static void main(String[] args) {
        System.out.println("Hello");

        char ch;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter An Alphabet: ");
        ch = s.next().charAt(0);

        if (ch == 'A')
        {
            System.out.println("You Entered A, Which Is Vowel");
        }

        else if (ch == 'E')
        {
            System.out.println("You Entered E, Which Is Vowel");
        }

        else if (ch == 'I')
        {
            System.out.println("You Entered I, Which Is Vowel");
        }

        else if (ch == 'O')
        {
            System.out.println("You Entered O, Which Is Vowel");
        }

        else if (ch == 'U')
        {
            System.out.println("You Entered U, Which Is Vowel");
        }

        else if (ch == 'a')
        {
            System.out.println("You Entered a, Which Is Vowel");
        }

        else if (ch == 'e')
        {
            System.out.println("You Entered e, Which Is Vowel");
        }

        else if (ch == 'i')
        {
            System.out.println("You Entered i, Which Is Vowel");
        }

        else if (ch == 'o')
        {
            System.out.println("You Entered o, Which Is Vowel");
        }

        else if (ch == 'u')
        {
            System.out.println("You Entered u, Which Is Vowel");
        }

        else
        {
            System.out.println("You Entered A Consonent");
        }
    }
}
