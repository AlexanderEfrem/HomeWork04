package OthertASKS.Task02;

public class Wheel {
    private Radius radius;
    private Season season;

    public Wheel(Radius radius, Season season) {
        this.radius = radius;
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Radius getRadius() {
        return radius;
    }

    public void setRadius(Radius radius) {
        this.radius = radius;
    }

    public void changeWhealSeasonType() {
        this.season = season;
    }

    public void changeRadius() {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", season=" + season +
                '}';
    }
}

enum Season {
    SUMMER,
    WINTER,
    AllSEASONS;
}

enum Radius {
    R15,
    R16,
    R17,
    R18,
    R19,
    R20,
    R21,
    R22;
}
