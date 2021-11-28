//5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
public class OldAndYoung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int PersonOneAge;
        int PersonTwoAge;
        int PersonThreeAge;

        System.out.print("Enter the age of first person : ");
        PersonOneAge = sc.nextInt();
        System.out.print("Enter the age of second person : ");
        PersonTwoAge = sc.nextInt();
        System.out.print("Enter the age of third person : ");
        PersonThreeAge = sc.nextInt();

        if ((PersonOneAge > PersonTwoAge) &&(PersonOneAge > PersonThreeAge))
            System.out.println("Person One is the Oldest Person");
        else if ((PersonOneAge < PersonTwoAge) &&(PersonOneAge < PersonThreeAge))
            System.out.println("Person One is the Youngest Person");
        if (( PersonTwoAge > PersonOneAge) && (PersonTwoAge > PersonThreeAge))
            System.out.println("Person two is the Oldest Person");
        else if ((PersonTwoAge < PersonOneAge) && (PersonTwoAge < PersonThreeAge))
            System.out.println("Person Two is the Youngest Person");
        if ((PersonThreeAge < PersonOneAge) && (PersonThreeAge < PersonTwoAge))
            System.out.println("Person Three is the Youngest Person");
        else if ((PersonThreeAge > PersonOneAge) && (PersonThreeAge > PersonTwoAge))
            System.out.println("Person Three is the Oldest Person");


    }
}
