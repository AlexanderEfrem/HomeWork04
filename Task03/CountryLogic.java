package OthertASKS.Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryLogic {

    public Country createCountry() {

        List<Region> regionList = new ArrayList<Region>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Regions");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Number of Regions");
        }
        int numberOfRegions = sc.nextInt();

        for (int counter = 0; counter < numberOfRegions; counter++) {
            RegionLogic regionLogic = new RegionLogic();
            Region region = regionLogic.createRegion();
            regionList.add(region);
        }

        System.out.println("Enter Country Name");
        String countryName = sc.next();

        Country country = new Country(regionList, countryName);
        return country;
    }

    public void printCountryArea(Country country) {
        Integer countryArea = new Integer("0");

        List<Region> tempRegionList = country.getRegionList();
        for (Region region : tempRegionList) {
            countryArea = region.getRegionArea() + countryArea;
        }
        System.out.println("Country Area = " + countryArea);
    }

    public void printRegionNumber(Country country) {
        System.out.println("Quantity of Regions = " + country.getRegionList().size());
    }

    public void printCapital(Country country) {
        List<Region> tempRegionList = country.getRegionList();
        for (Region region : tempRegionList) {
            for (Town town : region.getListOfRegionTowns()){
                if (town.isCapital() == true) {
                    System.out.println(town.getName() + " is the capital of " +country.getCountryName());
                }
            }
        }
    }

    public void printRegionCenters(Country country) {
        List<Region> tempRegionList = country.getRegionList();
        for (Region region : tempRegionList) {
            for (Town town : region.getListOfRegionTowns()){
                if (town.isRegionCenter() == true) {
                    System.out.println(town.getName() + " is the Region Center of  " +country.getCountryName());
                }
            }
        }
    }
}
