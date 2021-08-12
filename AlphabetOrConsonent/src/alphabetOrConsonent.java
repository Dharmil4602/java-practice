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

        System.out.println(" ");

        // Same Example With Switch Case:

        System.out.println("Same Example With Switch Case");

        System.out.println(" ");

        char character;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Character For Switch Case Method: ");
        character = sc.next().charAt(0);

        switch (character)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("You Entered A Vowel");
                break;

            default:
                System.out.println("You Entered A Consonent Or A Number");
        }

    }
}
