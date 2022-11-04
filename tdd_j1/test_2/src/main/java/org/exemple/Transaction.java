package org.exemple;

import java.util.Calendar;

public class Transaction {

    int amount;
    int newBalance;
    Calendar date;

    public Transaction(int amount, int newBalance, Calendar date) {
        this.amount = amount;
        this.newBalance = newBalance;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", newBalance=" + newBalance +
                ", date=" + date.get(Calendar.DAY_OF_MONTH) +
                '}';
    }
}