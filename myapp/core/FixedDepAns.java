package myapp.core;

public class FixedDepAns extends BankAccAns {

    private float interest = 0;
    private int duration = 0;

    public FixedDepAns(String name, float initialBal) {
        // Call parent class default constructor
        super(name, initialBal);
    }

    public FixedDepAns(String name, float initialBal, float interest) {
        super(name, initialBal); // ..
        this.interest = interest;
    }

    public FixedDepAns(String name, float initialBal, float interest, int duration) {
        this(name, initialBal, interest); //calls the constructor above without needing to call the parent constructor
        this.duration = duration;
    }
    @Override
    public float getBalance() {
        return super.getBalance() * .1f;  //gets the parent's balance
    }
}
