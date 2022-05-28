package WIA1002.TUTO.TUTO_1;

public abstract class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    @Override
    public int deposit(int depositAMount){
        return balance = balance + depositAMount;
    }
    
    @Override
    public boolean withdraw(int withdrawAmount){
        if(withdrawAmount <= balance){
            balance = balance - withdrawAmount;
            return true;
        }
        else
            return false;
    }
}
