package whileloop;
//write a program to calculate sum of digits of a number.
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("The sum of digit of given number is "+ sum);
        sc.close();
    }
}
