package co.pragra.bank;

public class RunBank {
    public static void main(String[] args) {
        Account account  = new Account();
        System.out.println("Fees is "+ account.getFees());
        double balance = account.withdrawMoney(6000);

        System.out.println("Balance is "+ balance);
        System.out.println("Fees is "+ account.getFees());

    }


}
