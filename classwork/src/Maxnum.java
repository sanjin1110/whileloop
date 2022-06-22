import java.util.Scanner;
// write a program to find maximum between 2 number.
public class Maxnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first;
        int second;

        System.out.print("ENTER A NUMBER : ");
        first = sc.nextInt();
        System.out.print("ENTER ANOTHER NUMBER : ");
        second = sc.nextInt();

        if (first > second) {
            System.out.print(first + " is maximum.");
        } else if (first < second) {
            System.out.print(second + " is maximum.");
        } else if (first == second) {
            System.out.print("Both are equal");
        } else System.out.println("INVALID INPUT");
        sc.close();
    }
}