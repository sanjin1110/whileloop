import java.util.Scanner;

public class factorialloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to get its factorial : ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=num; i>0; i--){
            fact = fact*i;

        }
        System.out.println(fact);
    }
}
