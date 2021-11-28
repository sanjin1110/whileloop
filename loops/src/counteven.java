import java.util.Scanner;

public class counteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting point : ");
        int first = sc.nextInt();
        System.out.print("Enter ending point : ");
        int last = sc.nextInt();
        int cout = 0;
        for (int i=first; i<=last; i++) {
            if (i % 2 == 0)
                cout++;
        }
        System.out.println(cout);
    }
}
