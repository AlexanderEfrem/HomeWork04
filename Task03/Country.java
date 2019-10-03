package OthertASKS.Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private List<Region> regionList;
    private String CountryName;

    public Country(List<Region> regionList, String countryName) {
        this.regionList = regionList;
        this.CountryName = countryName;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String name) {
        this.CountryName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(regionList, country.regionList) &&
                Objects.equals(CountryName, country.CountryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionList, CountryName);
    }

    @Override
    public String toString() {
        return "Country{" +
                "regionList=" + regionList +
                ", CountryName='" + CountryName + '\'' +
                '}';
    }
}
