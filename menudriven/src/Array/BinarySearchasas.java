package Array;



import java.util.Scanner;



public class BinarySearchasas {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];



        for(int i=0; i<arr.length; i++){
            System.out.print("Enter value : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search value : ");
        int searchValue = sc.nextInt();
        binarySearch(arr,searchValue);
    }



    public static void binarySearch(int[] arr,int searchValue) {
        int first = 0;
        int last = arr.length-1;
        boolean flag = false;



        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==searchValue){
                flag=true;
                break;
            }
            else if(arr[mid]<searchValue){
                first =mid+ 1;
            }
            else {
                last = mid-1;
            }



        }
        if(flag){
            System.out.println("found");
        }
        else
            System.out.println("not found");




    }



}