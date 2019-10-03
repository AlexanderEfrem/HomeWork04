package OthertASKS.Task03;

import java.util.Scanner;

public class TownLogic {
    boolean isCapital;
    boolean isRegionCenter;

    public Town createTown() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Town Name");
        String name = sc.next();

        System.out.println("Is town Capital?" + "\nEnter 1 if Yes" + "\nEnter 2 if No");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Is town Capital?" + "\nEnter 1 if Yes" + "\nEnter 2 if No");
        }
        int townCapital = sc.nextInt();

        switch (townCapital) {
            case 1:
                isCapital = true;
                isRegionCenter = true;
                break;

            case 2:
                isCapital = false;
                break;
        }
        if (isCapital == false) {
            System.out.println("Is town Region Center?" + "\nEnter 1 if Yes" + "\nEnter 2 if No");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Is town Region Center?" + "\nEnter 1 if Yes" + "\nEnter 2 if No");
            }
            int regionCenter = sc.nextInt();

            switch (regionCenter) {
                case 1:
                    isRegionCenter = true;
                    break;

                case 2:
                    isRegionCenter = false;
                    break;
            }
        }
        Town town = new Town(name, isCapital, isRegionCenter);
        return town;
    }
}
