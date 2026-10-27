package ec.edu.espoch.account.Interfacez;

import ec.edu.espoch.account.Objetos.SavingAccount;

public interface InterfaceSavingAccounts {

    public boolean withdraw(SavingAccount savingaccount, float value);
    public boolean deposit(SavingAccount savingaccount, float value);
    public float montthlyStatement(SavingAccount savingaccount);
    public String show();

}
