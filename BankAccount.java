public class BankAccount {
    private double balance ;
    public BankAccount(){
        this.balance=0;
    }
    public void deposit(double deposit){
        this.balance+=deposit;

    }

    public void withdraw(double withdraw){

        if(this.balance<0){
            System.out.println("you can't withdraw");
        }
        if(withdraw>this.balance){
            System.out.println("you can't withdraw");
        }
        else{
            this.balance-=withdraw;
        }

    }

    public double getBalance(){
        return balance;
    }





}
