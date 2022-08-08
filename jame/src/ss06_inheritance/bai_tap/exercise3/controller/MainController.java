package ss06_inheritance.bai_tap.exercise3.controller;

import ss06_inheritance.bai_tap.exercise3.model.MovablePoint;
import ss06_inheritance.bai_tap.exercise3.model.Point;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2,3);

        System.out.println("Thay đổi gía trị x và y: ");
        point.setXY(9,9);
        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3,4);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(6,7,8,9);
        System.out.println(movablePoint);

        System.out.println("Thay đổi giá trị x và y của moveablePoint: ");
        movablePoint.setXY(6,8);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

    }
}
