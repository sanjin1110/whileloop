package Functions;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        checkPalin(num);
        sc.close();
    }
    public static void checkPalin(int num1){
        int rem = num1%10;
        int quot = num1/10;
        int result = rem*10+quot;
        if (num1==result){
            System.out.println("Palindrome number");
        }
        else
            System.out.println("Not Palindrome");


    }

}
