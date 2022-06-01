package myapp.core;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class BankAccAns {
    private String name;
    private String acctID = UUID.randomUUID().toString().substring(0,8);
    private float balance = 0;

    private List<String> transaction = new LinkedList<>(); //Everytime when object is instantiated, this will be created

    public BankAccAns(String name) {
        this.name = name;
    }

    public BankAccAns(String name, float initialBal) {
        this.name = name;
        this.balance = initialBal;
    }

    public BankAccAns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctID() {
        return acctID;
    }

    public void setAcctID(String acctID) {
        this.acctID = acctID;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<String> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<String> transaction) {
        this.transaction = transaction;
    }
    
    
}
