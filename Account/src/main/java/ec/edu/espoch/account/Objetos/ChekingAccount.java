package ec.edu.espoch.account.Objetos;

public class ChekingAccount extends Account {
    
  protected float overdraft = 0.0f;

    public ChekingAccount(float balance, float annualinterest) {
        super(balance, annualinterest);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    
}


