package ec.edu.espoch.account.Implementaciones;

import ec.edu.espoch.account.Interfacez.InterfaceSavingAccounts;
import ec.edu.espoch.account.Objetos.SavingAccount;

public class SavingAccounts extends Accounts implements InterfaceSavingAccounts {
    
    @Override
    public boolean withdraw(SavingAccount savingaccount, float value) {
        boolean res = false;
        if(isActive(savingaccount)){
            res = super.withdraw(savingaccount, value);
        }
        return res;
    }


    @Override
    public boolean deposit( SavingAccount savingaccount, float value) {
        boolean res=false;
        if (isActive(savingaccount)){
           res = super.deposit(savingaccount, value);
            
        }
        
        
        return res;
    }

    @Override
    public float montthlyStatement(SavingAccount savingaccount) {  
  
       return 0.0f;
    }

    @Override
    public String show() {
        
        return "";
    }

    private boolean isActive (SavingAccount savingaccount){
        if (savingaccount.getBalance() <= 1000){    
        savingaccount.setState(false);
        } else {
        savingaccount.setState(true);
        }
        return savingaccount.isState();
        
    }
}
