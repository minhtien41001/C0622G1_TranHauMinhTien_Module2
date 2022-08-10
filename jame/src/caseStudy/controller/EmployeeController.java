package caseStudy.controller;

import caseStudy.service.IEmployeeService;
import caseStudy.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private Scanner scanner = new Scanner(System.in);
    private IEmployeeService iEmployeeService = new EmployeeService();

    public void menuEmployee(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN--- \n" +
                    "1. Hiển thị danh sách nhân viên \n" +
                    "2. Thêm nhân viên \n" +
                    "3. Chỉnh sửa nhân viên \n" +
                    "4. Trở lại menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    iEmployeeService.displayAllEmployee();
                    break;
                }
                case 2:{
                    iEmployeeService.addEmployee();
                    break;
                }
                case 3:{
                    iEmployeeService.editEmployee();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
