package OthertASKS.Task04;

import java.util.Scanner;

public class BankAccountLogic {


    public BankAccount createBankAccount(int clientID) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank Account Number");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Bank Account Number");
        }
        Integer bankAccountNumber = sc.nextInt();

        System.out.println("Enter Amount");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Amount");
        }
        Integer bankAccountAmount = sc.nextInt();


        BankAccount bankAccount = new BankAccount(bankAccountNumber, clientID, false, bankAccountAmount);
        return bankAccount;
    }

    public void blockAccount(BankAccount bankAccount) {
        if (bankAccount.getIsBlocked() == false) {
            bankAccount.setIsBlocked(true);
            System.out.println("This account number is blocked");
        } else {
            System.out.println("This account number has been already blocked");
        }
    }

    public void unblockAccount(BankAccount bankAccount) {
        if (bankAccount.getIsBlocked() == true) {
            bankAccount.setIsBlocked(false);
            System.out.println("This account number is unblocked");
        } else {
            System.out.println("This account number has been already blocked");
        }
    }

}
