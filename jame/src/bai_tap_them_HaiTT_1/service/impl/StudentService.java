package bai_tap_them_HaiTT_1.service.impl;

import bai_tap_them_HaiTT_1.model.Student;
import bai_tap_them_HaiTT_1.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công! ");
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Student student : studentList){
            if (student.getId() == idRemove){
                System.out.println("Bạn có chắc muốn xóa sinh viên này? " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1){
                    studentList.remove(student);
                    System.out.println("Xóa thành công! ");
                }
                isFlag =true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy sinh viên này! ");
        }
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    @Override
    public void findById() {
        boolean check = false;
        System.out.println("Nhập ID sinh viên cần tìm: ");
        int findId = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList){
            if (findId == student.getId()){
                System.out.println(student);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy sinh viên có ID " + findId);
        }
    }

    @Override
    public void findByName() {
        boolean check = false;
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String findName = scanner.nextLine();

        for (Student student : studentList){
            if (student.getName().contains(findName)){
                System.out.println(student);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy sinh viên có tên " + findName);
        }
    }

    @Override
    public void bubbleSortByName() {
        boolean needNextPass = true;
        for (int i = 1; i < studentList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < studentList.size() - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        displayStudent();
    }


    public static Student infoStudent(){
        System.out.println("Nhập ID sinh viên: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh sinh viên: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính của sinh viên: ");
        String sex = scanner.nextLine();

        System.out.println("Nhập lớp của sinh viên: ");
        String className = scanner.nextLine();

        System.out.println("Nhập điểm của sinh viên: ");
        double point = Double.parseDouble(scanner.nextLine());

        return new Student(id,name,dateOfBirth,sex,className,point);
    }
}
