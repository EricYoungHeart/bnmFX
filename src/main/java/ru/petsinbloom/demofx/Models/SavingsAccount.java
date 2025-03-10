package ru.petsinbloom.demofx.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.StringProperty;

public class SavingsAccount extends Account {
    // The withdrawal limit from the savings
    private final DoubleProperty withdrawalLimit;

    public SavingsAccount(String owner, String accountNumber, Double balance, Double withdrawalLimit) {
        super(owner, accountNumber, balance);
        this.withdrawalLimit=new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawalLimit);
    }

    public DoubleProperty withdrawalLimitProperty() {return this.withdrawalLimit;}
}
