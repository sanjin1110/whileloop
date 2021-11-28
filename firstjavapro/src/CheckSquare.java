//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
public class CheckSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int length;
        int breadth;
        int result;

        System.out.print("ENTER length : ");
        length = sc.nextInt();
        System.out.print("Enter breadth : ");
        breadth = sc.nextInt();

        if (length==breadth){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
        // result = length * breadth;



    }
}
