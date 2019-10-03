package OthertASKS.Task03;

public class Main {
    public static void main(String[] args) {
        CountryLogic countryLogic = new CountryLogic();
        Country country = countryLogic.createCountry();
        countryLogic.printCountryArea(country);
        countryLogic.printRegionNumber(country);
        countryLogic.printCapital(country);
        countryLogic.printRegionCenters(country);
    }
}
