package Unit1;

public class Bank {
    private int balance=12000;
    public void withdrawl(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException(("Cannot withdraw amount greater than balance"));
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawl Successfull ,Final Balance is "+balance);
        }
    }
}
