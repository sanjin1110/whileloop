import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Driven Program");
        System.out.println("--------------------");
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Simple Interest");
        System.out.println("3. Palindrome Number");
        System.out.println("4. Odd Even");
        System.out.print("Enter your choice (1,2,3,4) : ");
        int choice = sc.nextInt();

        switch (choice){

            case 1:
                System.out.print("Enter first number : ");
                int FirstNum = sc.nextInt();
                System.out.print("Enter Second number : ");
                int SecondNum = sc.nextInt();
                int Result = FirstNum+SecondNum;
                System.out.println("The sum is " + Result);
                break;

            case 2:
                System.out.print("Enter Principle:");
                float Principle = sc.nextFloat();
                System.out.print("Enter time:");
                float Time = sc.nextFloat();
                System.out.print("Enter Rate:");
                float Rate = sc.nextFloat();
                float result = (Principle*Time*Rate)/100;
                System.out.println("The Simple Interest is " + result);
                break;

            case 3:
                System.out.print("Enter a number:");
                int Num = sc.nextInt();
                int rem = Num%10;
                int quot = Num/10;
                int result1 = rem*10+quot;
                if (Num==result1)
                    System.out.println("palindrome");
                else
                    System.out.println("Not palindrome");
                break;

            case 4:
                System.out.println("Enter a num to check odd/even : ");
                int num = sc.nextInt();
                if (num%2==0){
                    System.out.print("Even");
                }
                else
                    System.out.println("Odd");
                break;

            default:
                System.out.print("Please Enter Valid Input");
        }
        sc.close();
    }
}
