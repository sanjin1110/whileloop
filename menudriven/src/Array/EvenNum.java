package Array;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        for (int i = 0; i<arr.length;i++) {
            System.out.print("Enter a value : ");

            arr[i] = sc.nextInt();
        }
        System.out.print("Even nos are : ");
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+"\n");
        }
    }
}
