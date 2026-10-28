package ec.edu.espoch.account.Implementaciones;

import ec.edu.espoch.account.Interfacez.InterfaceSavingAccounts;
import ec.edu.espoch.account.Objetos.SavingAccount;

public class SavingAccounts extends Accounts implements InterfaceSavingAccounts {

    @Override
    public boolean withdraw(SavingAccount savingaccount, float value) {
        boolean res = false;

        if (isActive(savingaccount)) {
            res = super.withdraw(savingaccount, value);
            isActive(savingaccount);
        }

        return res;
    }

    @Override
    public boolean deposit(SavingAccount savingaccount, float value) {
        boolean res = false;

        if (isActive(savingaccount)) {
            res = super.deposit(savingaccount, value);
        }

        return res;
    }

    @Override
    public float montthlyStatement(SavingAccount savingaccount) {
        if (savingaccount.getNumberofwithdrawals() > 4) {
            float aux = (savingaccount.getNumberofwithdrawals() - 4) * 1000;
            savingaccount.setMonthlyfee(savingaccount.getMonthlyfee() + aux);
        }

        super.montthlyStatement(savingaccount);
        isActive(savingaccount);

        return savingaccount.getBalance();
    }

    @Override
    public String show(SavingAccount savingaccount) {
        isActive(savingaccount);
        int transactions = savingaccount.getNumberofdeposits()+ savingaccount.getNumberofwithdrawals();

        return "Cuenta de ahorros"
                + "\nSaldo: " + savingaccount.getBalance()
                + "\nComision mensual: " + savingaccount.getMonthlyfee()
                + "\nTransacciones: " + transactions
                + "\nActiva: " + savingaccount.isState();
    }

    private boolean isActive(SavingAccount savingaccount) {
        if (savingaccount.getBalance() < 10000) {
            savingaccount.setState(false);
        } else {
            savingaccount.setState(true);
        }

        return savingaccount.isState();
    }
}
