package ss06_inheritance.bai_tap.exercise1.controller;

import ss06_inheritance.bai_tap.exercise1.model.CircleController;

public class TestCircle {
    public static void main(String[] args) {
        CircleController circle = new CircleController();

        circle.setColor("red");
        circle.setRadius(8);

        System.out.println("Hình tròn: " + circle.toString());
        System.out.println("Hình tròn có màu: " + circle.getColor());
        System.out.println("Hình tròn có bán kính: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle.getArea());
        System.out.println("Bán kính hình tròn là: " + circle.getPerimeter());
    }
}
