
interface Bank {

    void calculateInterest(double principal, double time, double rate);

    void calculateHomeLoan(int time);

    void deposit(double amount);

    void withdraw(double amount);

    void calculatePersonalLoan(double loanAmount, int rate, int loanTerm);

    void calculateFormalLoan(int time);

    void displayDetails();
}

class SBI implements Bank {

    private double interest;
    private double amount;
    private double personalLoan;
    private double formalLoan;
    private double homeLoan;

    SBI() {
        this.amount = 1000.0;
    }

    @Override
    public void calculateInterest(double principal, double time, double rate) {
        this.interest = principal * time * rate;
    }

    @Override
    public void calculateHomeLoan(int time) {
        this.homeLoan = amount * 0.08 * time;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.amount -= amount;
    }

    @Override
    public void calculatePersonalLoan(double loanAmount, int rate, int loanTerm) {
        this.personalLoan = loanAmount * rate * loanTerm;
    }

    @Override
    public void calculateFormalLoan(int time) {
        this.formalLoan = amount * 0.05 * time;
    }

    @Override
    public void displayDetails() {
        System.out.println("SBI Bank");
        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
        System.out.println("Personal Loan: " + personalLoan);
        System.out.println("Formal Loan: " + formalLoan);
        System.out.println("Home Loan: " + homeLoan);
        System.out.println();
    }
}

class ICICI implements Bank {

    private double interest;
    private double amount;
    private double personalLoan;
    private double formalLoan;
    private double homeLoan;

    ICICI() {
        this.amount = 1000.0;
    }

    @Override
    public void calculateInterest(double principal, double time, double rate) {
        this.interest = principal * time * rate;
    }

    @Override
    public void calculateHomeLoan(int time) {
        this.homeLoan = amount * 0.09 * time;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.amount -= amount;
    }

    @Override
    public void calculatePersonalLoan(double loanAmount, int rate, int loanTerm) {
        this.personalLoan = loanAmount * rate * loanTerm;
    }

    @Override
    public void calculateFormalLoan(int time) {
        this.formalLoan = amount * 0.05 * time;
    }

    @Override
    public void displayDetails() {
        System.out.println("ICICI Bank");
        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
        System.out.println("Personal Loan: " + personalLoan);
        System.out.println("Formal Loan: " + formalLoan);
        System.out.println("Home Loan: " + homeLoan);
        System.out.println();
    }
}

public class RBI {

    public static void main(String[] args) {
        Bank[] banks = {new ICICI(), new SBI()};

        banks[0].deposit(10000);
        banks[0].withdraw(5000);
        banks[0].calculateInterest(10000, 2, 0.05);
        banks[0].calculatePersonalLoan(10000, 2, 5);
        banks[0].calculateFormalLoan(5);
        banks[0].calculateHomeLoan(5);
        banks[0].displayDetails();

        banks[1].deposit(20000);
        banks[1].withdraw(1000);
        banks[1].calculateInterest(20000, 2, 0.05);
        banks[1].calculatePersonalLoan(20000, 2, 5);
        banks[1].calculateFormalLoan(7);
        banks[1].calculateHomeLoan(8);
        banks[1].displayDetails();
    }
}
