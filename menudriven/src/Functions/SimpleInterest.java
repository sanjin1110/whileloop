package Functions;

import java.util.Scanner;
//parameterized with return type
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        float principle = sc.nextFloat();
        System.out.print("Enter time : ");
        float time = sc.nextFloat();
        System.out.print("Enter rate : ");
        float rate = sc.nextFloat();
        float result = simpleInterest(principle,time,rate);
        System.out.println("the simple interest is : "+result);
    }
    public static float simpleInterest(float principle,float rate,float time){  //returntype

        return (principle*time*rate)/100;
    }
}
