// check palindrome of 2-digit number
import java.util.Scanner;

public class CheckPalindromeOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 digit number to check for palindrome : ");
        int num = sc.nextInt();
        int rem = num%10;
        int quot = num/10;
        int result = rem*10+quot;

        if (result == num)
            System.out.print(num+" is a palindrome.");
        else
            System.out.print(num+"is not palindrome.");

        sc.close();
//        alternate method:
//        int num;
//
//        System.out.print("Enter 2 digit number to check for palindrome : ");
//        num = sc.nextInt();
//
//        if (num/10 == num%10)
//            System.out.print("Palindrome");
//        else
//            System.out.print("Not palindrome");

    }
}
