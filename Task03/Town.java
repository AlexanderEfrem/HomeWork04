package OthertASKS.Task03;

import java.util.Objects;

public class Town {
    private String name;
    private boolean isCapital;
    private boolean isRegionCenter;

    public Town(String name, boolean isCapital, boolean isRegionCenter) {
        this.name = name;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town)) return false;
        Town town = (Town) o;
        return isCapital() == town.isCapital() &&
                isRegionCenter() == town.isRegionCenter() &&
                Objects.equals(getName(), town.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isCapital(), isRegionCenter());
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", isCapital=" + isCapital +
                ", isRegionCenter=" + isRegionCenter +
                '}';
    }
}
