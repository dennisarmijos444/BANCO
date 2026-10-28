package ec.edu.espoch.account.Interfacez;

import ec.edu.espoch.account.Objetos.ChekingAccount;

public interface InterfaceChekingAccounts {

    public boolean withdraw(ChekingAccount chekingaccount, float value);
    public boolean deposit(ChekingAccount chekingaccount, float value);
    public float CalculatemonthlyInterest(ChekingAccount chekingaccount);
    public boolean montthlyStatement(ChekingAccount chekingaccount);
    public String show(ChekingAccount chekingaccount);
}
