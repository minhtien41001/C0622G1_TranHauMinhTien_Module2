package ss06_inheritance.bai_tap.exercise1.controller;

import ss06_inheritance.bai_tap.exercise1.model.CylinderController;

public class TestCylinder {
    public static void main(String[] args) {
        CylinderController cylinder =new CylinderController();

        cylinder.setRadius(6);
        cylinder.setColor("blue");
        cylinder.setHeight(10);
        System.out.println("Hình trụ: " + cylinder.toString());
        System.out.println("Hình trụ có màu " + cylinder.getColor());
        System.out.println("Bán kính hình trụ: " + cylinder.getRadius());
        System.out.println("Chiều cao hình trụ: " + cylinder.getHeight());
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());
    }
}
