import java.util.Scanner;

public class Deposit {
    Scanner sc = new Scanner(System.in);
    static double deposit;

    void d(double balance){
        System.out.println("Enter the amount you want to Deposit");
        deposit = sc.nextDouble();
        Main.ubalance = deposit + balance;
        System.out.println("Your current balance become \"" + Main.ubalance + "\"");
    }
}
