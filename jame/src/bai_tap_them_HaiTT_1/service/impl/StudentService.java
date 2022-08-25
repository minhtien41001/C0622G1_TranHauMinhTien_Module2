package bai_tap_them_HaiTT_1.service.impl;

import bai_tap_them_HaiTT_1.exception.DuplicateIDException;
import bai_tap_them_HaiTT_1.exception.InputClassException;
import bai_tap_them_HaiTT_1.exception.InputNameException;
import bai_tap_them_HaiTT_1.model.Student;
import bai_tap_them_HaiTT_1.service.IStudentService;
import bai_tap_them_HaiTT_1.utils.*;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
//    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "jame/src/bai_tap_them_HaiTT_1/data/studentList.csv";


    @Override
    public void addStudent() {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công! ");

        WriteFileUtil.writeStudentFile(PATH,studentList);
    }

    @Override
    public void removeStudent() {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Student student : studentList){
            if (student.getId() == idRemove){
                System.out.println("Bạn có chắc muốn xóa sinh viên này? \n " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1){
                    studentList.remove(student);
                    System.out.println("Xóa thành công! ");

                    WriteFileUtil.writeStudentFile(PATH,studentList);
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
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    @Override
    public void findById() {
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
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
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
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
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
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

        WriteFileUtil.writeStudentFile(PATH,studentList);
    }


    public static Student infoStudent(){
        List<Student> studentList = ReadFileUtil.readStudentFile(PATH);
        int id;
        while (true) {
            try {
                System.out.println("Nhập ID sinh viên: ");
                 id = Integer.parseInt(scanner.nextLine());

                for (Student student :studentList){
                    if (student.getId() == id){
                        throw new DuplicateIDException("Trùng ID,vui lòng nhập lại! ");
                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }

        String name;
        while (true) {
            try {
                name= InputUtil.getString("Nhập tên học sinh mới: ");
                name = InputNameUtil.getNameUtil(name);
                break;
            } catch (InputNameException e) {
                System.err.println(e.getMessage());
            }

        }

        String dateOfBirth = InputDateOfBirthUtil.getBirthDay("Nhập ngày sinh của sinh viên: ");

        System.out.println("Nhập giới tính của sinh viên: ");
        String sex = scanner.nextLine();

//        System.out.println("Nhập lớp của sinh viên: ");
        String className ;
        while (true) {


            try {
                className = InputUtil.getString("Nhập lớp của sinh viên: ");
                className = InputClassUtil.getClassRegex(className);
                break;
            } catch (InputClassException e) {
                System.err.println(e.getMessage());
            }
        }

        double point;
        while (true){
            try{
                System.out.println("Nhập điểm của sinh viên: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }
        }
        return new Student(id,name,dateOfBirth,sex,className,point);
    }
}
