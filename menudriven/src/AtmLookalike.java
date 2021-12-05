import java.util.Scanner;

public class AtmLookalike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = "Kiran";
        String name2 = "Sanjin";
        int acc_no1 = 101;
        int acc_no2 = 102;
        float bal1 = 20000F;
        float bal2 = 100000F;

        System.out.println("HAMRO BANK");
        System.out.println("-----------");
        System.out.print("Enter account no : ");
        int ac = sc.nextInt();
        char ch = 0;
        do {
            if (ac != acc_no1 && ac != acc_no2) {
                System.out.print("No account found");
            } else {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice : ");
                int choice = sc.nextInt();
                if (ac == acc_no1) {
                    System.out.println("hello " + name1);
                } else
                    System.out.println("hello " + name2);

                switch (choice) {
                    case 1:
                        System.out.print("Enter a amount to deposit : ");
                        float amt = sc.nextFloat();
                        if (ac == acc_no1) {
                            System.out.print(name1);
                            bal1 = amt + bal1;
                            System.out.println(" Your new balance is " + bal1);
                        } else {
                            System.out.print(name2);
                            bal2 = amt + bal2;
                            System.out.print("your new balance is " + bal2);
                        }
                        break;

                    case 2:
                        System.out.print("Enter an amount to withdraw : ");
                        float amt1 = sc.nextFloat();
                        if (ac == acc_no1) {
                            System.out.print(name1);
                            if (amt1 > bal1)
                                System.out.print("Low balance in ac, cannot withdraw...");
                            else {
                                bal1 = bal1 - amt1;
                                System.out.print("your new balance is " + bal1);
                            }
                        } else {
                            System.out.print(name2);
                            if (amt1 > bal2)
                                System.out.print("Low balance in ac, cannot withdraw...");
                            else {
                                bal2 = bal2 - amt1;
                                System.out.print("your new balance is " + bal2);
                            }
                        }
                        break;

                    case 3:
                        if (ac == acc_no1) {
                            System.out.print(name1);
                            System.out.print("Your balance is " + bal1);
                        } else {
                            System.out.print(name2);
                            System.out.print("Your balance is " + bal2);
                        }
                        break;

                    case 4:
                        do {
                            System.out.print("Do you want to exit? (Y?N)");
                            ch = sc.next().toLowerCase().charAt(0);
                            System.exit(0);

                            break;
                        }
                        while(ch == 'y');

                    default:
                        System.out.print("invalid option");


                }
                System.out.print("Do you want to continue? (Y?N)");
                ch = sc.next().toLowerCase().charAt(0);
            }
        }while (ch =='y');
        sc.close();

    }
}
