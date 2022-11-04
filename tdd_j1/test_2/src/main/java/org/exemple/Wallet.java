package org.exemple;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Wallet {
    private final int overdraftLimit = 200;

    private ArrayList transactionsHistory;

    private int balanceInCents;

    public Wallet(int initialDeposit){
        balanceInCents = initialDeposit;
        transactionsHistory = new ArrayList();
    }

    public int getBalanceInCents() {
        return balanceInCents;
    }

    public void makeDepositInCents(int amount){
        balanceInCents += amount;
        Transaction newTransaction = new Transaction(amount, balanceInCents, Calendar.getInstance());
        transactionsHistory.add(newTransaction);
    }
    public void makeWithDrawInCents(int amount) throws Exception {
        if(balanceInCents - amount < overdraftLimit)
        {
            throw new Exception("Can't have an overdraft of more than 200");
        }
        balanceInCents -= amount;
        Transaction newTransaction = new Transaction(amount, balanceInCents, Calendar.getInstance());
        transactionsHistory.add(newTransaction);
    }


    public ArrayList getTransactionsHistory() {
        return transactionsHistory;
    }
}