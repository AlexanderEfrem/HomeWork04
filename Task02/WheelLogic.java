package OthertASKS.Task02;

import java.util.Scanner;

public class WheelLogic {
    private Radius radius;
    private Season season;

    public Wheel selectWheel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Wheel Radius");
        System.out.println(java.util.Arrays.asList(Radius.values()));
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println(java.util.Arrays.asList(Radius.values()));
        }
        int x = sc.nextInt();
        switch (x) {
            case 1:
                this.radius = Radius.R15;
                break;
            case 2:
                this.radius = Radius.R16;
                break;
            case 3:
                this.radius = Radius.R17;
                break;
            case 4:
                this.radius = Radius.R18;
                break;
            case 5:
                this.radius = Radius.R19;
                break;
            case 6:
                this.radius = Radius.R20;
                break;
            case 7:
                this.radius = Radius.R21;
                break;
            case 8:
                this.radius = Radius.R22;
                break;
        }

        System.out.println("Select Wheel Season");
        System.out.println(java.util.Arrays.asList(Season.values()));
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println(java.util.Arrays.asList(Season.values()));
        }
        int y = sc.nextInt();
        switch (y) {
            case 1:
                this.season = Season.SUMMER;
                break;
            case 2:
                this.season = Season.WINTER;
                break;
            case 3:
                this.season = Season.AllSEASONS;
                break;
        }
        Wheel wheel = new Wheel(this.radius,this.season);
        return wheel;
    }
}
