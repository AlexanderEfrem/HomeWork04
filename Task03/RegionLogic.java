package OthertASKS.Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegionLogic {

    public Region createRegion() {
        Scanner sc = new Scanner(System.in);
        List<Town> regionTowns = new ArrayList<Town>();

        System.out.println("Enter how many towns in your region");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter how many towns in your region");
        }
        int townQuantity = sc.nextInt();

        for (int x = 0; x < townQuantity; x++) {
            TownLogic townLogic = new TownLogic();
            Town town = new TownLogic().createTown();
            regionTowns.add(town);
            for (Town i : regionTowns) {
                System.out.println(i);
            }
        }

        System.out.println("Enter Region Name");
        String regionName = sc.next();

        System.out.println("Enter Region area");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Region area");
        }
        Integer regionArea = sc.nextInt();


        Region createdRegion = new Region(regionTowns, regionName, regionArea);

        return createdRegion;
    }
}
