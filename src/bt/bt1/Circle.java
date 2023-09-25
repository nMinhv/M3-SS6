package bt.bt1;

public class Circle {
    private final double PI = 3.14;
    double r;
    String color;
    public Circle() {

    }
    public void setR (double r) {
        this.r = r;
    }
    public double perimeter () {return PI*2*r;};
    public double area() {return PI*r*r;};
}
