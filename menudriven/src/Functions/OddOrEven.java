package Functions;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check odd/even : ");
        int num = sc.nextInt();
        String result = oddEven(num);
        System.out.println(result);
        sc.close();
    }

    public static  String oddEven(int num) {
        if (num%2==0){
            return "even";
        }
        else
            return "odd";

    }
}
