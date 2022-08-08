package ss06_inheritance.bai_tap.exercise2.controller;

import ss06_inheritance.bai_tap.exercise2.model.Point3D;

public class Point3DController {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(2,3,4);
        System.out.println(point3D1);

        Point3D point3D2 = new Point3D();
        point3D2.setX(5);
        point3D2.setY(6);
        point3D2.setZ(7);
        System.out.println(point3D2);
    }
}
