package whileloop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER : ");
        int num = sc.nextInt();
        int fibo = 0;
        int num1 = 1;
        while (num>0){
            fibo = fibo+num1;
            num++;


        }
        System.out.println(fibo);
    }
}
