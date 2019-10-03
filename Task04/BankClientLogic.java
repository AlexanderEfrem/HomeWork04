package OthertASKS.Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankClientLogic {

    public int createClientID() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client ID");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Client ID");
        }
        int clientID = sc.nextInt();
        return clientID;
    }

    public BankClient createBankClient() {
        BankAccountLogic bankAccountLogic = new BankAccountLogic();
        List<BankAccount> bankAccountList = new ArrayList<BankAccount>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Bank Accounts");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of Bank Accounts");
        }
        int bankAccountCounter = sc.nextInt();

        for (int counter = 0; counter < bankAccountCounter; counter++) {
            BankAccount bankAccount = bankAccountLogic.createBankAccount(createClientID());
            bankAccountList.add(bankAccount);
        }

        System.out.println("Enter Client Name");
        String bankClientName = sc.next();

        BankClient bankClient = new BankClient(bankAccountList.get(0).getClientID(), bankClientName, bankAccountList);
        return bankClient;
    }

    public void printAmountOfAllBankAccounts(BankClient bankClient) {
        Integer amountOfAllBankAccounts = 0;
        List<BankAccount> tempListOfBankAccounts = bankClient.getListOfBankAccounts();
        for (BankAccount bankAccount : tempListOfBankAccounts) {
            if (bankAccount.getIsBlocked() == false) {
                amountOfAllBankAccounts = bankAccount.getAmount() + amountOfAllBankAccounts;
            }
        }
        System.out.println("Amount of all Bank Accounts = " + amountOfAllBankAccounts);
    }
}
