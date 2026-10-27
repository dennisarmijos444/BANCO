package ec.edu.espoch.account.Implementaciones;


import ec.edu.espoch.account.Interfacez.InterfaceChekingAccounts;

public class ChekingAccounts extends Accounts implements InterfaceChekingAccounts {
    
        @Override
        public float withdraw(float value) {
        
        return 0.0f;
    }

        
        @Override
    public float deposit( float value) {
        
        return 0.0f;
    }

        @Override
    public float CalculatemonthlyInterest() {
        
        return 0.0f;
    }

        @Override
    public String show() {
        return "";
    }

    
}
