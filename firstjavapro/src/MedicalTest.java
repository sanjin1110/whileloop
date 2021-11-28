import java.util.Scanner;
public class MedicalTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int classes_held;
//        int classes_attended;
//        System.out.print("Number of classes held: ");
//        classes_held = sc.nextInt();
//
//        System.out.print("Number of classes attended: ");
//        classes_attended = sc.nextInt();
//
//        if (classes_attended > classes_held) {
//            System.out.println("You are joking right");
//            System.exit(0);
//        }
//
//        float result = (classes_attended * 100) / classes_held;
//        String output = "Wrong input";
//
//        if (result >= 75) {
//            output = "You are allowed to take exam with " + result;
//        }
//        if (result < 75) {
//            output = "You are not allowed to take exam with " + result;
//        }
//
//        System.out.println(output);

        System.out.print("Do you have medical cause ?(Y/N) : ");
        String yn = sc.next().toUpperCase();
        if (yn.length()>1){
            System.out.print("You should type Y or N.");
        }
        if (yn.contains("Y")){
            System.out.print("You are  not allowed to give exam.");
        }
        if (yn.contains("N")){
            System.out.print("YOu are allowed on exam hall.");
        }
    }
}
