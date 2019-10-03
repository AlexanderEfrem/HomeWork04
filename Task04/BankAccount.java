package OthertASKS.Task04;

import java.util.Comparator;
import java.util.Objects;

public class BankAccount implements Comparator<BankAccount> {

    private Integer accountNumber;
    private int clientID;
    private boolean isBlocked;
    private Integer amount;

    public BankAccount(Integer accountNumber, int clientID, boolean isBlocked, Integer amount) {
        this.accountNumber = accountNumber;
        this.clientID = clientID;
        this.isBlocked = isBlocked;
        this.amount = amount;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        Integer i1 = o1.getAmount();
        Integer i2 = o2.getAmount();
        return i1.compareTo(i2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getClientID() == that.getClientID() &&
                getIsBlocked() == that.getIsBlocked() &&
                Objects.equals(getAccountNumber(), that.getAccountNumber()) &&
                Objects.equals(getAmount(), that.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getClientID(), getIsBlocked(), getAmount());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", clientID=" + clientID +
                ", isBlocked=" + isBlocked +
                ", amount=" + amount +
                '}';
    }

}


