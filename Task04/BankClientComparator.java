package OthertASKS.Task04;

import java.util.Comparator;

public class BankClientComparator implements Comparator<BankClient> {

    @Override
    public int compare(BankClient o1, BankClient o2) {
        String i1 = o1.getName();
        String i2 = o2.getName();
        return  i1.compareTo(i2);
    }
}
