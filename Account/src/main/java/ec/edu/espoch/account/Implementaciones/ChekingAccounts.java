package ec.edu.espoch.account.Implementaciones;

import ec.edu.espoch.account.Interfacez.InterfaceChekingAccounts;
import ec.edu.espoch.account.Objetos.ChekingAccount;

public class ChekingAccounts extends Accounts implements InterfaceChekingAccounts {

    @Override
    public boolean withdraw(ChekingAccount chekingaccount, float value) {
        boolean res = false;

        if (value > 0) {
            if (value <= chekingaccount.getBalance()) {
                res = super.withdraw(chekingaccount, value);
            } else {
                float aux = value - chekingaccount.getBalance();
                chekingaccount.setBalance(0);
                chekingaccount.setOverdraft(chekingaccount.getOverdraft() + aux);
                chekingaccount.setNumberofwithdrawals(chekingaccount.getNumberofwithdrawals() + 1);
                res = true;
            }
        }

        return res;
    }

    @Override
    public boolean deposit(ChekingAccount chekingaccount, float value) {
        boolean res = super.deposit(chekingaccount, value);

        if (res && chekingaccount.getOverdraft() > 0) {
            if (chekingaccount.getBalance() >= chekingaccount.getOverdraft()) {
                float aux = chekingaccount.getBalance() - chekingaccount.getOverdraft();
                chekingaccount.setBalance(aux);
                chekingaccount.setOverdraft(0);
            } else {
                float aux = chekingaccount.getOverdraft() - chekingaccount.getBalance();
                chekingaccount.setOverdraft(aux);
                chekingaccount.setBalance(0);
            }
        }

        return res;
    }

    @Override
    public float CalculatemonthlyInterest(ChekingAccount chekingaccount) {
        return chekingaccount.getBalance() * chekingaccount.getAnnualinterest() / 12;
    }

    @Override
    public boolean montthlyStatement(ChekingAccount chekingaccount) {
        boolean res = super.montthlyStatement(chekingaccount);

        if (chekingaccount.getBalance() < 0) {
            chekingaccount.setOverdraft(chekingaccount.getOverdraft() - chekingaccount.getBalance());
            chekingaccount.setBalance(0);
            chekingaccount.setMontthlyStatement(0);
        }

        return res;
    }

    @Override
    public String show(ChekingAccount chekingaccount) {
        int transactions = chekingaccount.getNumberofdeposits()
                + chekingaccount.getNumberofwithdrawals();

        return "Cuenta corriente"
                + "\nSaldo: " + chekingaccount.getBalance()
                + "\nComision mensual: " + chekingaccount.getMonthlyfee()
                + "\nTransacciones: " + transactions
                + "\nSobregiro: " + chekingaccount.getOverdraft();
    }
}
