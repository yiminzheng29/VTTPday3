package myapp.core;

public class Main2 {
    
    public static void main(String[] args) {
        BankAccAns acct = new BankAccAns();
        System.out.printf("name: %s\n", acct.getName());
        System.out.printf("acctID: %s\n", acct.getAcctID());
        System.out.printf("balance: %s\n", acct.getBalance());
    }
}
