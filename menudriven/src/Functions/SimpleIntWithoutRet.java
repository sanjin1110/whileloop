package Functions;

import java.util.Scanner;
//parameterized without return type
public class SimpleIntWithoutRet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        float principle = sc.nextFloat();
        System.out.print("Enter time : ");
        float time = sc.nextFloat();
        System.out.print("Enter rate : ");
        float rate = sc.nextFloat();
        simpleInterest(principle,time,rate);
    }
    public static void simpleInterest(float principle,float rate,float time){  //returntype
        float result = (principle*time*rate)/100;
        System.out.println("the simple interest is : "+result);

    }
}
