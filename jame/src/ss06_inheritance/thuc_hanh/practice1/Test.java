package ss06_inheritance.thuc_hanh.practice1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.setRadius(5);
        circle.setColor("red");
        circle.setFilled("yellow");
        System.out.println("Hình tròn " + circle.toString());
        System.out.println("Bán kính của hình tròn là: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());

        rectangle.setHeight(4);
        rectangle.setWidth(6);
        rectangle.setColor("black");
        rectangle.setFilled("Blue");
        System.out.println("Hình chữ nhật: " + rectangle.toString());
        System.out.println("Chiều rộng của hình chữ nhật là: " + rectangle.getWidth() );
        System.out.println("Chiều dài của hình chữ nhật là: " + rectangle.getHeight());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
    }
}
