package Reconciliation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Match {
    private static ArrayList<Account> customer = new ArrayList<>();

    public void main(String[] args) throws IOException {
        ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("mainmasterfile.ser"));

        try {

            try {
                while (true) {
                    Account data = (Account) fileIn.readObject();
                    customer.add(data);
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


//        displayArray(customer);
//        System.out.println("Now we will show the transactions, \n");
//
//        Collections.shuffle(customer);
//        displayArray(customer);
//        System.out.println("\n");
//
//        //Put sort function here test the order of account number
//        AccountSort(customer);
//        displayArray(customer);
//        System.out.println("\n");



    }

    public void MatchToTransaction() {

        for (Account account : customer) {
            for(TransactionRecord.exchange.getAccountNumberTransaction())
        }
    }

    public static void displayArray(ArrayList<Account> customer)
    {
        for(Account customers : customer) {
            System.out.println(customers.getAccount() + " " + customers.getFirstName()
                    + customers.getLastName() + " " + customers.getBalance());
        }
    }

    public static void AccountSort(ArrayList<Account> customer) {

        for (int i = 0; i < customer.size() - 1; i++) {

            for (int j = 0; j < customer.size() - i - 1; j++) {

                if (customer.get(j).getAccount() >
                        customer.get(j + 1).getAccount()) {

                    Account temp = customer.get(j);
                    customer.set(j, customer.get(j + 1));
                    customer.set(j + 1, temp);
                }
            }
        }
    }

    public static void getCustomerNumber(int accountNumber)
    {
        for (Account customers : customer)
        {
            if (customers.getAccount() == accountNumber)
            {
                System.out.println(customers.getAccount());
            }
        }
    }

}
