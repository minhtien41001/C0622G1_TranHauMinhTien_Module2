package bai_tap_them_HaiTT_1.controller;

import bai_tap_them_HaiTT_1.service.IStudentService;
import bai_tap_them_HaiTT_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void menuStudent(){
        do{
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--- \n" +
                    "1. Thêm mới sinh viên \n" +
                    "2. Xóa sinh viên \n" +
                    "3. Xem danh sách sinh viên \n" +
                    "4. Tìm kiếm sinh viên theo ID \n" +
                    "5. Tìm kiếm sinh viên theo tên\n" +
                    "6. Sắp xếp sinh viên theo tên \n" +
                    "7. Trở về menu chính");
            System.out.println("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iStudentService.addStudent();
                    break;
                }
                case 2:{
                    iStudentService.removeStudent();
                    break;
                }
                case 3:{
                    iStudentService.displayStudent();
                    break;
                }
                case 4:{
                    iStudentService.findById();
                    break;
                }
                case 5:{
                    iStudentService.findByName();
                    break;
                }
                case 6:{
                    iStudentService.bubbleSortByName();
                }
                case 7:{
                    return;
                }
            }
        }while (true);
    }

}
