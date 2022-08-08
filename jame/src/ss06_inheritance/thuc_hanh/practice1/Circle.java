package ss06_inheritance.thuc_hanh.practice1;

public class Circle extends Geometric{
    private double radius;

    public Circle() {
    }

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }

    public double getPerimeter(){
        return  2 * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }
}
