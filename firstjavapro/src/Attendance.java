/*6.A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.Scanner;
public class Attendance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float ClassHeld;
        float ClassAttended;
        float Percent;

        System.out.print("Enter the total number of class held : ");
        ClassHeld = sc.nextFloat();
        System.out.print("Enter the total number of class attended : ");
        ClassAttended = sc.nextFloat();

        Percent = (ClassAttended/ClassHeld)*100;

        System.out.print("Your attendance is " + Percent+"%\n");

        if(Percent>=75){
            System.out.print("You are allowed to exam.");
        }
        else{
            System.out.print("You are not allowed to exam.");
        }

    }
}
