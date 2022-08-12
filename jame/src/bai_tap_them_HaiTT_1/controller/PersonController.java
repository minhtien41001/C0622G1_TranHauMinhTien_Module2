package bai_tap_them_HaiTT_1.controller;

import java.util.Scanner;

public  class PersonController {
    public static void displayMainMenu(){
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("--------------------------");
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN VÀ HỌC VIÊN--- \n" +
                    "1. Quản lý giảng viên \n" +
                    "2. Quản lý học viên \n" +
                    "3. Exit");
            System.out.println("Mời bạn nhập lựa chọn để tiếp tục: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    teacherController.menuTeacher();
                    break;
                }
                case 2:{
                    studentController.menuStudent();
                    break;
                }
                case 3:{
                    System.exit(1);
                }
            }
        }while (true);
    }
}