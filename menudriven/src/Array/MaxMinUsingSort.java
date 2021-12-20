package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMinUsingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i=0; i<arr.length;i++){
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i<arr.length;i++) {
            Arrays.sort(arr);
        }
        System.out.println("Minimum number = "+arr[0]);
        System.out.println("Maximum number = "+arr[size-1]);
        System.out.println("Second maximum number = "+arr[size-2]);

    }
}
