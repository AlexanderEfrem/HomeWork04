package OthertASKS.Task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BankLogic {

    public Bank createBank() {
        List<BankClient> listOfBankClients = new ArrayList<BankClient>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Bank Clients");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of Bank Clients");
        }
        int bankClientCounter = sc.nextInt();

        for (int counter = 0; counter < bankClientCounter; counter++) {
            BankClientLogic clientLogic = new BankClientLogic();
            BankClient bankClient = clientLogic.createBankClient();
            listOfBankClients.add(bankClient);
        }
        Bank bank = new Bank(listOfBankClients);
        return bank;
    }

    public void printFoundBankClientByClientName(Bank bank) {
        Scanner sc = new Scanner(System.in);
        List<BankClient> tempListOfBankClients = bank.getListOfBankClients();

        System.out.println("Enter Client Name you want to find");
        String foundedBankClientName = sc.next();
        for (BankClient bankClient : tempListOfBankClients) {
            if (foundedBankClientName.equals(bankClient.getName())) {
                System.out.println(bankClient.toString());
            }
        }
    }

    public void printSortedByNameBankClients(Bank bank) {
        System.out.println("-------------Before Sorting----------------");
        for (BankClient bankClient: bank.getListOfBankClients()) {
            System.out.println(bankClient.toString());
        }

        Collections.sort(bank.getListOfBankClients(), new BankClientComparator());
        System.out.println("-------------After Sorting----------------");
        for (BankClient bankClient: bank.getListOfBankClients()) {
            System.out.println(bankClient.toString());
        }
    }
}
