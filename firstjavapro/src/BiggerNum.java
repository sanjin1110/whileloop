//2.Take two int values from user and print greatest among them.
import java.util.Scanner;
public class BiggerNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int First;
        int Second;

        System.out.print("Enter first num: ");
        First = sc.nextInt();
        System.out.print("Enter second num: ");
        Second = sc.nextInt();

        if(First > Second){
            System.out.print(First + " is a greater number.");
        }
        else{
            System.out.print(Second + " is the greater number.");
        }
    }

}
