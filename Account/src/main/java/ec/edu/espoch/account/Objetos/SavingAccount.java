package ec.edu.espoch.account.Objetos;

public class SavingAccount extends Account {
    
    protected boolean State;

    public SavingAccount(boolean State, float balance, float annualinterest) {
        super(balance, annualinterest);
        this.State = balance >= 10000;
    }



    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        this.State = balance >= 10000;
    }


    
}
