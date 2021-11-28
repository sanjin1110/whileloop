
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input

        System.out.print("Enter a character : ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {

            case 'a':
                System.out.print("vowel");
                break;
            case 'e':
                System.out.print("vowel");
                break;
            case 'i':
                System.out.print("vowel");
                break;
            case 'o':
                System.out.print("vowel");
                break;
            case 'u':
                System.out.print("vowel");
                break;
            default:
                System.out.print("Consonant");
        }
    }
}
