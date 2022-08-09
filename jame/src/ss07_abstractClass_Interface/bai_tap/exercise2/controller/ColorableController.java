package ss07_abstractClass_Interface.bai_tap.exercise2.controller;

import ss07_abstractClass_Interface.bai_tap.exercise2.model.Circle;
import ss07_abstractClass_Interface.bai_tap.exercise2.model.Rectangle;
import ss07_abstractClass_Interface.bai_tap.exercise2.model.Shape;
import ss07_abstractClass_Interface.bai_tap.exercise2.model.Square;

public class ColorableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("blue",true, 10.0,16.0);
        shapes[1] = new Square("yellow",false,6.0);
        shapes[2] = new Circle("red", true,8.0);

        for (Shape shape : shapes){
            System.out.printf("Diện tích: %.2f", shape.getArea());
            System.out.println();
            System.out.printf("Chu vi: %.2f", shape.getPerimeter());
            System.out.println();
            if (shape instanceof Shape){
                shape.howToColor();
                System.out.println("------------");
            }
        }
    }
}
