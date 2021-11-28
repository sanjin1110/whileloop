package whileloop;

import java.util.Scanner;

public class PalindromeNumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome : ");
        int num = sc.nextInt();
        int a = num;
        int reverse = 0;

        while (num>0)
        {
            int rem = num%10;
            reverse = reverse * 10 + rem;
            num = num/10;

        }
        if (a == reverse)
        {
            System.out.println("palindrome");
        }
        else
            System.out.print("Not palindrome");

    }
}
