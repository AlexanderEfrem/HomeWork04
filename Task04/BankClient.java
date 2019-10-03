package OthertASKS.Task04;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BankClient  {
    private int clientID;
    private String name;
    private List<BankAccount> listOfBankAccounts;

    public BankClient(int clientID, String name, List<BankAccount> listOfBankAccounts) {
        this.clientID = clientID;
        this.name = name;
        this.listOfBankAccounts = listOfBankAccounts;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getListOfBankAccounts() {
        return listOfBankAccounts;
    }

    public void setListOfBankAccounts(List<BankAccount> listOfBankAccounts) {
        this.listOfBankAccounts = listOfBankAccounts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankClient)) return false;
        BankClient that = (BankClient) o;
        return getClientID() == that.getClientID() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getListOfBankAccounts(), that.getListOfBankAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientID(), getName(), getListOfBankAccounts());
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "clientID=" + clientID +
                ", name='" + name + '\'' +
                ", listOfBankAccounts=" + listOfBankAccounts +
                '}';
    }

}
