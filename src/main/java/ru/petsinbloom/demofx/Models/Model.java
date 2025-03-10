package ru.petsinbloom.demofx.Models;

import ru.petsinbloom.demofx.Views.AccountType;
import ru.petsinbloom.demofx.Views.ViewFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Model {
    private static Model model;

    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
    private AccountType loginAccountType = AccountType.CLIENT;

    // Client data Section
    private final Client client;
    private boolean clientLoginSuccessFlag;
    // Admin Data Section

    private Model(){
        viewFactory = new ViewFactory();
        databaseDriver = new DatabaseDriver();
        // Client Data Section
        clientLoginSuccessFlag = false;
        client = new Client("", "", "", null, null, null);
    }
    public static synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory(){ return viewFactory; }

    public DatabaseDriver getDatabaseDriver(){ return databaseDriver; }

    public AccountType getLoginAccount() {
        return loginAccountType;
    }
    public void setLoginAccount(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    // Client Methods Section
    public boolean getClientLoginSuccessFlag(){ return clientLoginSuccessFlag; }
    public void setClientLoginSuccessFlag(boolean flag){ clientLoginSuccessFlag = flag; }
    public Client getClient(){ return client; }

    public void evaluateClientCred(String pAddress, String password) throws SQLException {
        CheckingAccount checkingAccount;
        SavingsAccount savingsAccount;

        ResultSet resultSet = databaseDriver.getClientData(pAddress, password);
        try{
            if(resultSet.isBeforeFirst()){
                this.client.firstNameProperty().set(resultSet.getString("FirstName"));
                this.client.lastNameProperty().set(resultSet.getString("LastName"));
                this.client.payeeAddressProperty().set(resultSet.getString("PayeeAddress"));
                String[] dateParts=resultSet.getString("Date").split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]));
                this.client.dateCreatedProperty().set(date);
                checkingAccount=null;
                savingsAccount=null;
                this.clientLoginSuccessFlag=true;
            }

        } catch (Exception ex){

        }

    }

}
