import java.util.Scanner;
//ctrl + alt + l = indentation milauni

//ctrl+ d = duplicate line
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float principle;
        float time;
        float rate;
        float simpleInterest;

        System.out.print("Principle : ");
        principle = sc.nextFloat();
        System.out.print("Time : ");
        time = sc.nextFloat();
        System.out.print("Rate : ");
        rate = sc.nextFloat();

        simpleInterest = (principle * time * rate)/ 100;

        System.out.print("Simple interest is : " + simpleInterest);


    }
}
