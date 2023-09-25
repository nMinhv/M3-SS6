package bt.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle radius");
        double r = Double.parseDouble(sc.nextLine());
        Circle circle = new Circle();
        circle.setR(r);
        System.out.println("perimeter circle is: " + circle.perimeter());
        System.out.println("area circle is: " + circle.area());
    }
}
