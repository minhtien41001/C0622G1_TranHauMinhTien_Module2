package ss5_static_accessModifier.bai_tap.accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.Area();
        circle.setColor("blue");
        String color = circle.getColor();
        System.out.printf("Diện tích hình tròn màu %s là %f ",color,area);
    }
}
