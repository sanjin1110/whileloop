import java.util.Scanner;

/*Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
Calculate percentage and grade according to following:
        Percentage >= 90% : Grade A
        Percentage >= 80% : Grade B
        Percentage >= 70% : Grade C
        Percentage >= 60% : Grade D
        Percentage >= 40% : Grade E
        Percentage < 40% : Grade F
*/
public class Reault {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        float physics;
        float chemistry;
        float bio;
        float math;
        float cs;
        float percent;
        float grade;

        System.out.print("Enter physics mark:");
        physics = sc.nextFloat();
        System.out.print("Enter chemistry mark:");
        chemistry = sc.nextFloat();
        System.out.print("Enter bio mark:");
        bio = sc.nextFloat();
        System.out.print("Enter math mark:");
        math = sc.nextFloat();
        System.out.print("Enter cs mark:");
        cs = sc.nextFloat();

        percent = ((physics+chemistry+bio+math+cs)*100)/500;
        System.out.print("Your percentage = "+percent);

        if (percent>=90)
            System.out.print("Grade = A");
        else if (percent>=80 && percent<90)
            System.out.print("Grade = B");

        else if (percent>=70 && percent<80)
            System.out.print("Grade = C");
        else if (percent>=60 && percent<70)
            System.out.print("Grade = D");
        else if (percent>=40 && percent<60)
            System.out.print("Grade = E");
        else if (percent<40)
            System.out.print("Grade F");

    }
}
