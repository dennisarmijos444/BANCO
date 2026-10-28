package ec.edu.espoch.account;

import ec.edu.espoch.account.Interfacez.InterfaceSavingAccounts;
import ec.edu.espoch.account.Interfacez.InterfaceChekingAccounts;
import ec.edu.espoch.account.Implementaciones.SavingAccounts;
import ec.edu.espoch.account.Implementaciones.ChekingAccounts;
import ec.edu.espoch.account.Objetos.SavingAccount;
import ec.edu.espoch.account.Objetos.ChekingAccount;

public class Bank {

    public static void main(String[] args) {
        SavingAccount savingaccount = new SavingAccount(true, 25000f, 0.15f);
        InterfaceSavingAccounts savings = new SavingAccounts();

        System.out.println("CUENTA DE AHORROS");
        savings.deposit(savingaccount, 5000);
        savings.withdraw(savingaccount, 1000);
        savings.withdraw(savingaccount, 1000);
        savings.withdraw(savingaccount, 1000);
        savings.withdraw(savingaccount, 1000);
        savings.withdraw(savingaccount, 1000);
        savings.montthlyStatement(savingaccount);
        System.out.println(savings.show(savingaccount));

        System.out.println("\nCUENTA CORRIENTE");
        ChekingAccount chekingaccount = new ChekingAccount(2000f, 0.15f);
        InterfaceChekingAccounts checking = new ChekingAccounts();

        checking.withdraw(chekingaccount, 3000);
        checking.deposit(chekingaccount, 500);
        checking.deposit(chekingaccount, 1200);
        checking.montthlyStatement(chekingaccount);
        System.out.println(checking.show(chekingaccount));
    }
}
