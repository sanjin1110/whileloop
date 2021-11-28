/*3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity
        Suppose, one unit will cost 100.
        Judge and print total cost for user.*/
import java.util.Scanner;
public class TotalCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantity;
        float TotalCost;
        float Discount;
        System.out.print("Enter purchased quantity: ");
        quantity = sc.nextInt();

        TotalCost = quantity * 100;
        Discount = (float) (TotalCost*0.1);
        if(quantity>10){
//            Discount = (TotalCost*0.1);
            TotalCost =TotalCost-Discount;
            System.out.print("The total cost after discount is : " + TotalCost);
        }
        else {
//            TotalCost = quantity * 100;
            System.out.print("The total cost is : " + TotalCost);
        }
    }
}
