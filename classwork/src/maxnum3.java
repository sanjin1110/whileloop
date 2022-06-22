import java.util.Scanner;
// write a program to find maximum between 2 number.
public class maxnum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first;
        int second;
        int third;
        System.out.print("ENTER A NUMBER : ");
        first = sc.nextInt();
        System.out.print("ENTER second NUMBER : ");
        second = sc.nextInt();
        System.out.print("ENTER third NUMBER : ");
        third = sc.nextInt();

        if (first > second && first > third) {
            System.out.print(first + " is maximum.");
        } else if (second > third && second > first) {
            System.out.print(second + " is maximum.");
        } else if (third>first && third > second) {
            System.out.print(third + " is maximum.");
        }
        else{
            System.out.println("Enter different number.");
        }
    }
}
