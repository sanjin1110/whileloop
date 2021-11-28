import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        char ch;

        System.out.print("Enter a character: ");
        char ch = toLowerCase(sc.next().charAt(0));
//        ch = toLowerCase;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.print("Vowel");}
        else{
            System.out.print("Consonant");}

    }
}

