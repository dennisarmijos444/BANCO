package ec.edu.espoch.account.Implementaciones;

import ec.edu.espoch.account.Objetos.Account;

public class Accounts {

    public boolean withdraw(Account account, float value) {
        boolean res= false;
        
        if (value >= account.getBalance()){
            float aux=account.getBalance() - value;
            account.setBalance(aux);
            res= true; 
        }
        
        return res;
    }

    public boolean deposit(Account account, float value) {
        
        float aux=account.getBalance() + value;
        account.setBalance(aux);
        //Deposita el monto de dinero
        //la cuenta
        return true;
    }

    private float CalculatemonthlyInterest(Account account) {
        return account.getAnnualinterest()/12;
        
    }

    public boolean montthlyStatement(Account account) {
        
        float monthlyInterest=CalculatemonthlyInterest(account);  
        float interestvalue= (account.getMonthlyfee())*monthlyInterest;
        float newBalance= account.getBalance()-account.getMonthlyfee() - interestvalue;
        account.setBalance(newBalance);
        
        return true;
    }

    public String show(Account account) {
       return "Account{" + "balance=" + account.getBalance()
                + "\n numberofdeposits=" + account.getNumberofdeposits()
                + "\n numberofwithdrawals=" + account.getNumberofwithdrawals()
                + "\n annualinterest=" + account.getAnnualinterest()
                + "\n monthlyfee=" + account.getMonthlyfee() + '}';
    }

}
