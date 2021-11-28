import java.util.Scanner;
//ctrl + alt + l = indentation milauni

//ctrl+ d = duplicate line
public class FirstProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // step 1: data representation
        int first;
        int second;
        int result;
        //step 2: input
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();

        // step 3 : algorithm
        result = first + second;

        // step 4: output

        System.out.print("Sum of "+first + " and "+second +" is " + result);

    }
}
