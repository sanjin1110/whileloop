/*write a program to determine the group of student. take two input from user i.e. age(int) and male(boolean).
If age>20 and its male,then he is a man else he is boy and if age>20 and its female then she is woman else she is a girl
 */


import java.util.Scanner;

public class DetermineGroup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;
        boolean male;

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.print("Are you male :(true/false) : ");
        male = sc.nextBoolean();

        if (male) {
            if (age<20)
                System.out.print("Boy");
            else
                System.out.print("Man");
        }
        else {
            if(age<20)
                System.out.print("Girl");
            else
                System.out.print("Woman");
        }

    }
}
