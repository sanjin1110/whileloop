package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<arr.length;i++){
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search value : ");
        int searchValue = sc.nextInt();
        boolean bhetayo = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == searchValue) {
                bhetayo = true;
                break;
            }
        }
        if (bhetayo)
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
