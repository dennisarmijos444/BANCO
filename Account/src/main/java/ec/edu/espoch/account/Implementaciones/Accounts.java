package ec.edu.espoch.account.Implementaciones;

import ec.edu.espoch.account.Objetos.Account;

public class Accounts {

    public boolean withdraw(Account account, float value) {
        boolean res = false;

        if (value > 0 && value <= account.getBalance()) {
            float aux = account.getBalance() - value;
            account.setBalance(aux);
            account.setNumberofwithdrawals(account.getNumberofwithdrawals() + 1);
            res = true;
        }

        return res;
    }

    public boolean deposit(Account account, float value) {
        boolean res = false;

        if (value > 0) {
            float aux = account.getBalance() + value;
            account.setBalance(aux);
            account.setNumberofdeposits(account.getNumberofdeposits() + 1);
            res = true;
        }

        return res;
    }

    private float CalculatemonthlyInterest(Account account) {
        return account.getBalance() * account.getAnnualinterest() / 12;
    }

    public boolean montthlyStatement(Account account) {
        float newBalance = account.getBalance() - account.getMonthlyfee();
        account.setBalance(newBalance);

        if (account.getBalance() > 0) {
            float monthlyInterest = CalculatemonthlyInterest(account);
            account.setBalance(account.getBalance() + monthlyInterest);
        }
        account.setMontthlyStatement(account.getBalance());

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
