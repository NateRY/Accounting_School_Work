package Reconciliation;

import Reconciliation.Account;
import java.io.*;
import java.util.ArrayList;


public class TransactionRecord implements Serializable {

    private static ArrayList<TransactionRecord> exchange = new ArrayList<>();

    private int accountId;
    private double balance;

    //public TransactionRecord(){}

    public void TransactionRecord(double balance){
        this.balance = balance;
        this.accountId = 0;
    }


    public void TransactionRecord(int accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getAccountId(){

        return this.accountID;
    }

    public double getbalance()
    {
        return this.balance;
    }

    // public void setBalance(double money)
    // {
    //     this.balance = money;
    // }


    void main(String[] args) throws IOException {
        ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("transactions.ser"));


        try {

            try {
                while (true) {
                    TransactionRecord data = (TransactionRecord) fileIn.readObject();
                    exchange.add(data);
                }

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                fileIn.close();
                System.out.println("End of file");
            }


        } catch (Exception e) {
            System.out.println("Error, I didn't read shit!");
        }

        displayTransactions(exchange);


    }

    void displayTransactions(ArrayList<TransactionRecord> transactions) throws IOException {
        ObjectOutputStream fileOut = new ObjectOutputStream( new FileOutputStream ("Transaction.ser"));

        for(TransactionRecord transaction : transactions)
        {
            System.out.println(transaction.accountId + " " + transaction.balance);
        }
    }

    void getAccountNumberTransaction(int accountId){

        for(TransactionRecord transaction : exchange){
            if(transaction.accountId == accountId)
            {


            }
        }

    }

    // public int etExchangeListSize()
    // {
        
    // }






}




