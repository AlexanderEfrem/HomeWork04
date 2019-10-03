package OthertASKS.Task03;

import java.util.List;
import java.util.Objects;

public class Region {
    private List<Town> listOfRegionTowns;
    private String regionName;
    private Integer regionArea;

    public Region(List<Town> listOfRegionTowns, String regionName, Integer regionArea) {
        this.listOfRegionTowns = listOfRegionTowns;
        this.regionName = regionName;
        this.regionArea = regionArea;
    }

    public List<Town> getListOfRegionTowns() {
        return listOfRegionTowns;
    }

    public void setListOfRegionTowns(List<Town> listOfRegionTowns) {
        this.listOfRegionTowns = listOfRegionTowns;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(Integer regionArea) {
        this.regionArea = regionArea;
    }

    @Override
    public String toString() {
        return "Region{" +
                "listOfRegionTowns=" + listOfRegionTowns +
                ", regionName='" + regionName + '\'' +
                ", regionArea=" + regionArea +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return Objects.equals(getListOfRegionTowns(), region.getListOfRegionTowns()) &&
                Objects.equals(getRegionName(), region.getRegionName()) &&
                Objects.equals(getRegionArea(), region.getRegionArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getListOfRegionTowns(), getRegionName(), getRegionArea());
    }
}
