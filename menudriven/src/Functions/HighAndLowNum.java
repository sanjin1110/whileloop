package Functions;

import java.util.Scanner;

public class HighAndLowNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int first = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int second = sc.nextInt();
        System.out.print("enter 3rd number : ");
        int third = sc.nextInt();
        highLow(first,second,third);

    }
    public static void highLow(int first, int second, int third){
        if (first>second && first>third)
            System.out.println("THe highest num is "+first);
        else if (first<second && first<third)
            System.out.println("the lowest num is "+first);
        if (second>first && second>third)
            System.out.println("THe highest num is "+second);
        else if (second<first && second<third)
            System.out.println("the lowest num is "+second);
        if (third>first && second<third)
            System.out.println("THe highest num is "+third);
        else if (third<first && second>third)
            System.out.println("the lowest num is "+third);

    }
}
