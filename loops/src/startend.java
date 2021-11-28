//even num from start to end as user inputs.
import java.util.Scanner;

public class startend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting point : ");
        int first = sc.nextInt();
        System.out.print("Enter ending point : ");
        int last = sc.nextInt();

        for (int i=first; i<=last; i++){
            if(i%2 == 0)
                System.out.println(i);

        }
    }
}
