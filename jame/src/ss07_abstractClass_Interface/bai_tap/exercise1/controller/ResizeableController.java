package ss07_abstractClass_Interface.bai_tap.exercise1.controller;

import ss07_abstractClass_Interface.bai_tap.exercise1.model.Circle;
import ss07_abstractClass_Interface.bai_tap.exercise1.model.Rectangle;
import ss07_abstractClass_Interface.bai_tap.exercise1.model.Shape;
import ss07_abstractClass_Interface.bai_tap.exercise1.model.Square;

public class ResizeableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",true,6.0);
        shapes[1] = new Rectangle("blue",false,8.0,6.0);
        shapes[2] = new Square("yellow",true,10.0);

        double percent = Math.random() * 100;
        System.out.println("Trước khi thay đổi: ");
        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.printf("Diện tích: %.2f", shape.getArea());
            System.out.println();
            System.out.printf("Chu vi: %.2f", shape.getPerimeter());
            System.out.println();
        }

        System.out.println();
        System.out.println("Percent: " + percent + "%");
        System.out.println();

        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes){
            shape.resize(percent);
            System.out.println(shape);
            System.out.printf("Diện tích: %.2f", shape.getArea());
            System.out.println();
            System.out.printf("Chu vi: %.2f", shape.getPerimeter());
            System.out.println();
        }
    }
}
