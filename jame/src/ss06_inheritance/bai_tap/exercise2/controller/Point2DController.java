package ss06_inheritance.bai_tap.exercise2.controller;

import ss06_inheritance.bai_tap.exercise2.model.Point2D;

public class Point2DController {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D(2,4);
        System.out.println(point2D1);

        Point2D point2D2 = new Point2D();
        point2D2.setX(2);
        point2D2.setY(3);
        System.out.println(point2D2);
    }
}
