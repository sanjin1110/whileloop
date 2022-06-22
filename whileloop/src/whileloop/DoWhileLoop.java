package whileloop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice1 = 0;

//        do {
            System.out.print("1. addition");
            System.out.print("2. subtraction");
            System.out.print("3. multiplication");
            System.out.print("Enter your choice : ");
//            boolean choice;
            int choice = 0;
            switch (choice){
                case 1:
                    System.out.print("Enter 1st num : ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2nd num : ");
                    int num2 = sc.nextInt();
                    int sum = num1+num2;
                    System.out.print("The sum is : "+ sum);
                    break;

                case 2:

                case 3:

                default:
                    System.out.print("invalid input");
                System.out.print("");

            }
//        }while (choice1 == 'y');
    }
}
