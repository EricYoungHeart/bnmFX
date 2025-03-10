package ru.petsinbloom.demofx.Models;

import javafx.beans.property.*;

public class CheckingAccount extends Account {
    // The number of transactions a client is allowed to do per day
    private final IntegerProperty transactionsLimit;

    public CheckingAccount(String owner, String accountNumber, Double balance, int trLimit) {
        super(owner, accountNumber, balance);
        this.transactionsLimit = new SimpleIntegerProperty(this, "Transactions Limit", trLimit);
    }

    public IntegerProperty transactionsLimitProperty() {return this.transactionsLimit;}
}
