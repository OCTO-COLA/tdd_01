package org.exemple;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BankAccountTest {

    @Test
    void initializingBankAccountShouldReturnZero() {
        // arrange

        // act
        BankAccount bankAccount = new BankAccount();

        // assert
        int balanceObtained = bankAccount.bankAccountWallet.getBalanceInCents();
        int balanceExpected = 0;
        assertThat(balanceObtained).isEqualTo(balanceExpected);
    }


    @Test
    void addingThousandToInitializedBankAccountShouldReturnThousand() {
        // arrange
        BankAccount bankAccount = new BankAccount();

        // act
        bankAccount.bankAccountWallet.makeDepositInCents(1000);

        // assert
        int balanceObtained = bankAccount.bankAccountWallet.getBalanceInCents();
        int balanceExpected = 1000;
        assertThat(balanceObtained).isEqualTo(balanceExpected);
    }

    @Test
    void WithdrawThousandToBankAccountAtThreeThousandBalanceShouldReturnTwoThousand() throws Exception {
        // arrange
        BankAccount bankAccount = new BankAccount();

        // act
        bankAccount.bankAccountWallet.makeDepositInCents(3000);
        bankAccount.bankAccountWallet.makeWithDrawInCents(1000);

        // assert
        int balanceObtained = bankAccount.bankAccountWallet.getBalanceInCents();
        int balanceExpected = 2000;
        assertThat(balanceObtained).isEqualTo(balanceExpected);
    }

    @Test
    void withdrawingTwoHundredAndOneFromAnAccountAtZeroBalanceShouldReturnAnError(){
        // arrange
        BankAccount bankAccount = new BankAccount();

        // act
        // assert
        assertThatThrownBy(() -> bankAccount.bankAccountWallet.makeWithDrawInCents(201)).isInstanceOf(Exception.class);
    }

    @Test
    void withNoTransactionWalletTransactionHistoryShouldReturnEmptyArrayList(){
        // arrange
        BankAccount bankAccount = new BankAccount();

        // act
        ArrayList TransactionsHistory = bankAccount.bankAccountWallet.getTransactionsHistory();

        // assert
        assertThat(TransactionsHistory).isEqualTo(new ArrayList());
    }

    @Test
    void makingTwoTransactionWalletTransactionHistoryShouldReturnAnArrayListOfTransaction() throws Exception {
        // arrange
        BankAccount bankAccount = new BankAccount();

        // act
        bankAccount.bankAccountWallet.makeDepositInCents(3000);
        bankAccount.bankAccountWallet.makeWithDrawInCents(1000);

        // assert
        System.out.print(bankAccount.bankAccountWallet.getTransactionsHistory());

    }
}