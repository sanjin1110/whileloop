package Array;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        arr = new int[5];

        for (int i=0;i<arr.length;i++){
            System.out.print("Enter a value : ");
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
