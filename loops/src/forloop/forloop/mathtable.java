package forloop;//multiplication table of any no.
import java.util.Scanner;

public class mathtable {
    public static void main(String[] args) {
        char choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number to get its multiplication table : ");
            int value = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(value + " * " + i + " = " + value * i);
            }

            System.out.print("Do you want to continue ? (Y/N)");
            choice = sc.next().toLowerCase().charAt(0);
        } while (choice=='y');
    }
}
