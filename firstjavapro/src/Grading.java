/*4.A school has following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask user to enter marks and print the corresponding grade.*/
import java.util.Scanner;
public class Grading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float YourGrade;

        System.out.print("Enter your mark : ");
        YourGrade = sc.nextFloat();

        if(YourGrade<25){
            System.out.print("Your grade is F.");
        }
        else if(YourGrade<45 && YourGrade>25){
            System.out.print("Your grade is E.");
        }
        else if(YourGrade<50 && YourGrade>45){
            System.out.print("Your grade is D.");
        }
        else if(YourGrade<60 && YourGrade>50){
            System.out.print("Your grade is C.");
        }
        else if(YourGrade<80 && YourGrade>60){
            System.out.print("Your grade is B.");
        }
        else if(YourGrade<=100 && YourGrade>80){
            System.out.print("Your grade is E.");
        }
        else{
            System.out.print("Please enter valid mark.");
        }
    }
}
