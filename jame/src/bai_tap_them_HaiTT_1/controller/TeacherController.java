package bai_tap_them_HaiTT_1.controller;

import bai_tap_them_HaiTT_1.service.ITeacherService;
import bai_tap_them_HaiTT_1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private ITeacherService iTeacherService = new TeacherService();
    private Scanner scanner = new Scanner(System.in);

    public void menuTeacher(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN--- \n" +
                    "1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n"  +
                    "4. Trở về menu chính");
            System.out.println("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iTeacherService.addTeacher();
                    break;
                }
                case 2:{
                    iTeacherService.removeTeacher();
                    break;
                }
                case 3:{
                    iTeacherService.displayTeacher();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
