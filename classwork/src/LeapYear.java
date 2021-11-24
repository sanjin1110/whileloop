//Write a program to check weather a year is a leap or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Year;
        System.out.print("Enter a year to check if it is a leap year or not : ");
        Year = sc.nextInt();
        if (Year%4 == 0){
            System.out.print(Year + " is a leap year.");
        }
        else{
            System.out.print(Year + " is not a leap year.");
        }
    }
}
