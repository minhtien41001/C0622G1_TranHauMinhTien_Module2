package ss06_inheritance.bai_tap.exercise1.model;

public class CylinderController extends CircleController {
    private double height;

    public CylinderController() {
    }

    public CylinderController(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getRadius() * getRadius() * 2 * height;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", height= " + height ;
    }
}
