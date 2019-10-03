package OthertASKS.Task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private List<BankClient> listOfBankClients = new ArrayList<BankClient>();

    public Bank(List<BankClient> listOfBankClients) {
        this.listOfBankClients = listOfBankClients;
    }

    public List<BankClient> getListOfBankClients() {
        return listOfBankClients;
    }

    public void setListOfBankClients(List<BankClient> listOfBankClients) {
        this.listOfBankClients = listOfBankClients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(getListOfBankClients(), bank.getListOfBankClients());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListOfBankClients());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "listOfBankClients=" + listOfBankClients +
                '}';
    }
}
