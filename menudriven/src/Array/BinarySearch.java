package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search value : ");
        int searchValue = sc.nextInt();
        int a = binarySearch(arr, searchValue);
        System.out.println("value found at index " + a);
    }

    public static int binarySearch(int[] arr, int searchValue) {
        int first = 0;
        int last = arr.length - 1;
//        boolean flag = false;
        int index = -1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == searchValue) {
                index = mid;
                break;
            } else if (arr[mid] < searchValue) {
                first = mid + 1;
            } else {
                last = mid - 1;

            }

        }
        return index;


    }

}
