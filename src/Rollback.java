public interface Rollback {
    void back();
}

class Back implements Rollback{
    Main M = new Main();


    @Override
    public void back() {
        if (Main.num == 2){
            Main.ubalance = Main.ubalance-Deposit.deposit;
            System.out.println("Your current balance become \"" + Main.ubalance + "\"");
        }
        else if (Main.num == 3){
            Main.ubalance = Main.ubalance+Withdraw.withdraw;
            System.out.println("Your current balance become \"" + Main.ubalance + "\"");
        }
    }
}