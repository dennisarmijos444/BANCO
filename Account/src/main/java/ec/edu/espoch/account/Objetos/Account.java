package ec.edu.espoch.account.Objetos;

public class Account { 
protected float balance; 
protected int numberofdeposits = 0;
protected int numberofwithdrawals = 0;
protected float annualinterest;
protected float monthlyfee = 0.0f;
protected float montthlyStatement;

    public Account(float balance, float annualinterest) {
        this.balance = balance;
        this.annualinterest = annualinterest;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberofdeposits() {
        return numberofdeposits;
    }

    public void setNumberofdeposits(int numberofdeposits) {
        this.numberofdeposits = numberofdeposits;
    }

    public int getNumberofwithdrawals() {
        return numberofwithdrawals;
    }

    public void setNumberofwithdrawals(int numberofwithdrawals) {
        this.numberofwithdrawals = numberofwithdrawals;
    }

    public float getAnnualinterest() {
        return annualinterest;
    }

    public void setAnnualinterest(float annualinterest) {
        this.annualinterest = annualinterest;
    }

    public float getMonthlyfee() {
        return monthlyfee;
    }

    public void setMonthlyfee(float monthlyfee) {
        this.monthlyfee = monthlyfee;
    }

    public float getMontthlyStatement() {
        return montthlyStatement;
    }

    public void setMontthlyStatement(float montthlyStatement) {
        this.montthlyStatement = montthlyStatement;
    }

    public String toString(Account account) {
        return "Account{" + "balance=" + account.getBalance()
                + "\n numberofdeposits=" + account.getNumberofdeposits()
                + "\n numberofwithdrawals=" + account.getNumberofwithdrawals()
                + "\n annualinterest=" + account.getAnnualinterest()
                + "\n monthlyfee=" + account.getMonthlyfee() + '}';
    }

}
