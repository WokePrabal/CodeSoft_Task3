import java.util.ArrayList;

public class Account {
    private String pin;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String pin, double initialBalance){
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }
    public boolean validatePIN(String inputPIN){
        return this.pin.equals(inputPIN);

    }

    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        this.transactionHistory.add("Deposited: Rs."+amount);
    }
    public boolean withdraw(double amount){
        if(amount>this.balance){
            return false;
        }
        else {
            this.balance-= amount;
            this.transactionHistory.add("Withdarw: Rs."+amount);
            return true;
        }
    }
    public void changePIN(String newPIN){
        this.pin = newPIN;
    }
    public ArrayList<String> getTransactionHistory(){
        return this.transactionHistory;
    }
}
