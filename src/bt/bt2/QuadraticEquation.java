package bt.bt2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public void setValue(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {

        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double sameRoot() {
        return -b / (2 * a);
    }

    public void answer() {
        double discriminant = getDiscriminant();
        System.out.println(discriminant);
//        if (a == 0) {
//            if (b == 0) {
//                if (c == 0) {
//                    System.out.println("there are infinity root");
//                }else {
//                    System.out.println("there is no real root");
//                }
//            }
//        }
        if (discriminant == 0) {
            System.out.println("there is exactly one real root −b/2a ," + sameRoot());
        } else if (discriminant < 0) {
            System.out.println("there are no real roots");
        } else {
            System.out.printf("there are two distinct roots x1 = %.3f , x2 = %.3f ,", getRoot1(), getRoot2());
        }
    }
}
