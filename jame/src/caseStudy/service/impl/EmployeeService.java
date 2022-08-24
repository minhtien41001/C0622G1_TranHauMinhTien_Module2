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
        System.out.println("Nhập ID nhân viên cần chỉnh sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        Employee temp=null;
        Employee employee1=null;
        for (Employee employee : employeeList) {
            if (employee.getId() == idEdit) {
                temp = employee;
                System.out.println("Nhập chỉnh sửa ID nhân viên: ");
                int setId = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập chỉnh sửa tên nhân viên: ");
                String setName = scanner.nextLine();

                System.out.println("Nhập chỉnh sửa ngày sinh nhân viên: ");
                String setDateOfBirth = scanner.nextLine();

                System.out.println("Nhập chỉnh sửa giới tính nhân viên: ");
                String setSex = scanner.nextLine();

                System.out.println("Nhập chỉnh sửa số CMND nhân viên: ");
                int setNumberCMND = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập chỉnh sửa SĐT nhân viên: ");
                int setPhoneNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập chỉnh sửa email nhân viên: ");
                String setEmail = scanner.nextLine();

                System.out.println("chỉnh sửa trình độ nhân viên: ");
                String setLevel = null;
                System.out.println("1.Trung cấp \n" +
                        "2. Cao đẳng \n" +
                        "3. Đại học \n" +
                        "4. Sau đại học");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:{
                        setLevel = "Trung cấp";
                        break ;
                    }
                    case  2:{
                        setLevel = "Cao đẳng";
                        break;
                    }
                    case 3:{
                        setLevel = "Đại học";
                        break;
                    }
                    case 4:{
                        setLevel = "Sau đại học";
                        break;
                    }
                }

                System.out.println("chỉnh sửa Vị trí nhân viên: ");
                String setLocation = null;
                System.out.println("1. Lễ tân \n" +
                        "2. Phục vụ \n" +
                        "3. Chuyên viên \n" +
                        "4. Giám sát \n" +
                        "5. Quản lý \n" +
                        "6. Giám đốc");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1: {
                        setLocation = "Lễ tân";
                        break;
                    }
                    case 2:{
                        setLocation = "Phục vụ";
                        break;
                    }
                    case 3:{
                        setLocation = "Chuyên viên" ;
                        break;
                    }
                    case 4:{
                        setLocation = "Giám sát";
                        break;
                    }
                    case 5:{
                        setLocation = "Quản lý";
                        break;
                    }
                    case 6:{
                        setLocation = "Giám đốc";
                        break;
                    }
//            default:
                }

                System.out.println("Chỉnh sửa Lương nhân viên: ");
                String setWage = scanner.nextLine();

                System.out.println("Chỉnh sửa nhân viên thành công! ");
                employee1 = new Employee(setId,setName,setDateOfBirth,setSex,setNumberCMND,setPhoneNumber,setEmail,setLevel,setLocation,setWage);
                break;
            }
        }
        if (temp!=null){
            int index=employeeList.indexOf(temp);
            employeeList.set(index,employee1);
        }
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
            String level = null;
            System.out.println("1.Trung cấp \n" +
                    "2. Cao đẳng \n" +
                    "3. Đại học \n" +
                    "4. Sau đại học");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    level = "Trung cấp";
                    break ;
                }
                case  2:{
                    level = "Cao đẳng";
                    break;
                }
                case 3:{
                    level = "Đại học";
                    break;
                }
                case 4:{
                    level = "Sau đại học";
                    break;
                }
            }

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
