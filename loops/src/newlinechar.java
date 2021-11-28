import java.util.Scanner;

public class newlinechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String sa = sc.nextLine();
        for(int i = 0; i<sa.length(); i++){
            System.out.println(sa.charAt(i));
        }
    }
}
