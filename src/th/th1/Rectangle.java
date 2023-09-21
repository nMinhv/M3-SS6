package th.th1;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String display() {

        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
    public double getPerimeter () {
        return (this.height + this.width) * 2;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
