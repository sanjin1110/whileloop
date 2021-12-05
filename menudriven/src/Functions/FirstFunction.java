package Functions;

import java.util.Scanner;

public class FirstFunction {
    public static void main(String[] args) {
//        int first = 3;
//        int second= 4;
//        int third = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int first = sc.nextInt();
        System.out.println("Enter second num : ");
        int second = sc.nextInt();
        System.out.println("Enter third num : ");
        int third = sc.nextInt();
        int result = addThreeNumber(first,second,third);
        System.out.println("The sum is : "+result);
        sc.close();
    }

    public static int addThreeNumber(int first,int second, int third){
        return first+second+third;
    }
}
