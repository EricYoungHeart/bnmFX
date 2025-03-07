package ru.petsinbloom.demofx.Models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Transaction {
    private final StringProperty sender;
    private final StringProperty recipient;
    private final DoubleProperty amount;
    private final ObjectProperty<LocalDate> date;
    private final StringProperty message;

    public Transaction(String sender, String recipient, Double amount, LocalDate date, String message) {
        this.sender = new SimpleStringProperty(this, "sender", sender);
        this.recipient = new SimpleStringProperty(this, "recipient", recipient);
        this.amount = new SimpleDoubleProperty(this, "amount", amount);
        this.date = new SimpleObjectProperty<>(this, "date", date);
        this.message = new SimpleStringProperty(this, "message", message);
    }

    public StringProperty senderProperty(){return this.sender;}
    public StringProperty recipientProperty(){return this.recipient;}
    public DoubleProperty amountProperty(){return this.amount;}
    public ObjectProperty<LocalDate> dateProperty(){return this.date;}
    public StringProperty messageProperty(){return this.message;}

}
