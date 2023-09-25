package bt.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setValue(a,b,c);
        System.out.println("Root");
        quadraticEquation.answer();
    }
}
