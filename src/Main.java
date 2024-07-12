import java.util.Scanner;

public class Main {

    static int num;
    static double ubalance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deposit D = new Deposit();
        Withdraw W = new Withdraw();
        balanceInquiry B = new balanceInquiry();
        Back Ba = new Back();

        System.out.println("\n   acount details");
        System.out.println("Enter your Acount Number");
        int pass = sc.nextInt();

        System.out.println("Enter your Name");
        String name = sc.next();

        System.out.println("Enter your Acount Balance");
        ubalance = sc.nextDouble();

        System.out.println(" \n Press 2 to Deposit"+
                "\n Press 3 to Withdraw" +
                "\n Press 4 to Show current balance" );
        num = sc.nextInt();

        switch (num){
            case 2:
                D.d(ubalance);
                break;
            case 3:
                W.w(ubalance);
                break;
            case 4:
                B.inquiry(ubalance);
                break;
        }
        l:
        for (int i=0; i<3 ;i++){
            System.out.println("\n Press 4 to Show current balance" +
                    "\n Press 5 to Cancel the transaction" +
                    "\n Press 6 to to Exit");
            int c = sc.nextInt();
            switch (c){
                case 4:
                    B.inquiry(ubalance);
                    break;
                case 5:
                    Ba.back();
                    break;
                case 6:
                    System.out.println("Thank you");
                    break l;
            }
    }   }
}