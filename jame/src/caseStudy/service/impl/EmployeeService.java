package caseStudy.service.impl;

import caseStudy.model.person.Employee;
import caseStudy.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayAllEmployee() {
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("Thêm mới nhân viên thành công! ");
    }

    @Override
    public void editEmployee() {

    }

    public static Employee infoEmployee(){
        System.out.println("Nhập ID nhân viên: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh nhân viên: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính nhân viên:");
        String sex = scanner.nextLine();

        System.out.println("Nhập số CMND của nhân viên: ");
        int numberCMND = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại của nhân viên: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email của nhân viên: ");
        String email = scanner.nextLine();

        System.out.println("Nhập trình độ của nhân viên: ");
        String level = scanner.nextLine();

        System.out.println("Chọn vị trí của nhân viên:");
        String location = null;
        System.out.println("1. Lễ tân \n" +
                "2. Phục vụ \n" +
                "3. Chuyên viên \n" +
                "4. Giám sát \n" +
                "5. Quản lý \n" +
                "6. Giám đốc");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:{
                 location = "Lễ tân";
                break;
            }
            case 2:{
                location = "Phục vụ";
                break;
            }
            case 3:{
                location = "Chuyên viên" ;
                break;
            }
            case 4:{
                location = "Giám sát";
                break;
            }
            case 5:{
                location = "Quản lý";
                break;
            }
            case 6:{
                location = "Giám đốc";
                break;
            }
//            default:
        }


        System.out.println("Nhập lương của nhân viên:");
        String wage = scanner.nextLine();

        return new Employee(id,name,dateOfBirth,sex,numberCMND,phoneNumber,email,level,location,wage);
    }
}
