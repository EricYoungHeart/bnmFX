package ru.petsinbloom.demofx.Models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Client {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Account> checkingAccount;
    private final ObjectProperty<Account> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String fName, String lName, String pAddress, Account chAccount, Account sAccount, LocalDate date) {
        this.firstName = new SimpleStringProperty(this, "FirstName", fName);
        this.lastName = new SimpleStringProperty(this, "LastName", lName);
        this.payeeAddress = new SimpleStringProperty(this, "Payee Address", pAddress);
        this.checkingAccount = new SimpleObjectProperty<>(this, "Checking Account", chAccount);
        this.savingsAccount=new SimpleObjectProperty<>(this, "Savings account", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "Date", date);
    }

    public StringProperty firstNameProperty(){return this.firstName;}
    public StringProperty lastNameProperty(){return this.lastName;}
    public StringProperty payeeAddressProperty(){return this.payeeAddress;}
    public ObjectProperty<Account> checkingAccountProperty(){return this.checkingAccount;}
    public ObjectProperty<Account> savingsAccountProperty(){return this.savingsAccount;}
    public ObjectProperty<LocalDate> dateCreatedProperty(){return this.dateCreated;}

}
