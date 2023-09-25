package bt.bt4;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int Speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        Speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public Fan() {};
    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void FanStatus () {
        if (on){
            System.out.printf("Fan is on,fan speed: %d, fan color: %s, fan radius: %f",Speed,color,radius);
        }else {
            System.out.printf("Fan is off, fan color: %s, fan radius: %f",color,radius);
        }
    };
}
