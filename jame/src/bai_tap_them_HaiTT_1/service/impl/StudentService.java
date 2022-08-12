package bai_tap_them_HaiTT_1.service.impl;

import bai_tap_them_HaiTT_1.model.Student;
import bai_tap_them_HaiTT_1.service.IStudentService;

import java.util.ArrayList;
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
        double point = scanner.nextDouble();

        return new Student(id,name,dateOfBirth,sex,className,point);
    }
}
