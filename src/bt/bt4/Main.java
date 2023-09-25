package bt.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan1 = new Fan();
        System.out.println("fan Speed?");
        int speed = Integer.parseInt(sc.nextLine());
        fan1.setSpeed(speed);
        System.out.println("is fan on?");
        boolean isOn = Boolean.parseBoolean(sc.nextLine());
        fan1.setOn(isOn);
        System.out.println("fan color?");
        String color = sc.nextLine();
        fan1.setColor(color);
        System.out.println("fan radius?");
        double r = Double.parseDouble(sc.nextLine());
        fan1.setRadius(r);
        fan1.FanStatus();
    }
}
