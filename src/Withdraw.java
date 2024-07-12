import java.util.Scanner;

public class Withdraw {
    Scanner sc = new Scanner(System.in);
    static double withdraw;

    void w(double balance){
        System.out.println("Enter the amount you want to Withdraw");
        withdraw = sc.nextDouble();
        Main.ubalance = balance - withdraw;
        System.out.println("Your current balance become \"" + Main.ubalance + "\"");
    }
}