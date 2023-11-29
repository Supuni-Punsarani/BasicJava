public class BankManagementSystem {
    public static void main(String[]args){
        BankAccount a=new BankAccount();
        a.deposit(500);
        a.withdraw(200);
        double x=a.getBalance();
        System.out.println("balance is:"+x);

    }
}
