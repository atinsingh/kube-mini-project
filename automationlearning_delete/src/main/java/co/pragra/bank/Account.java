package co.pragra.bank;

public class Account {
    private final double MINIMUM_BALANCE = 5000;
    private double fees = 0;
    private double balance = 10000;



    public double withdrawMoney(double amount){
        if(amount>0 && balance>=amount){
            balance = balance-amount;
            if(balance<=MINIMUM_BALANCE){
                this.fees = 15;
            }
        }else {
            System.out.println("Not a valid withdrawl");
        }
        return balance;
    }

    public double depositMoney(double amount){
        if(amount>0){
            balance  = balance+ amount;
        }else {
            System.out.println("Not a valid deposite");
        }
        return balance;
    }

    public double getFees() {
        return fees;
    }
}
