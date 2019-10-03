package OthertASKS.Task04;


public class Main {
    public static void main(String[] args) {
        BankLogic banklogic = new BankLogic();
        Bank bank = banklogic.createBank();
        banklogic.printFoundBankClientByClientName(bank);
        banklogic.printSortedByNameBankClients(bank);
    }
}
