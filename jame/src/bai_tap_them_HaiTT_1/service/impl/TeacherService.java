package bai_tap_them_HaiTT_1.service.impl;

import bai_tap_them_HaiTT_1.exception.DuplicateIDException;
import bai_tap_them_HaiTT_1.model.Student;
import bai_tap_them_HaiTT_1.model.Teacher;
import bai_tap_them_HaiTT_1.service.ITeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới giảng viên thành công!");
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập ID giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher : teacherList){
            if (teacher.getId() == idRemove){
                System.out.println("Bạn có chắc muốn xóa giảng viên này? " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1){
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công! ");
                }
                isFlag =true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy giảng viên này! ");
        }
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
    }

    @Override
    public void findByIdTeacher() {
        boolean check = false;
        System.out.println("Nhập ID của giảng viên cần tìm: ");
        int findIdTeacher = Integer.parseInt(scanner.nextLine());

        for (Teacher teacher : teacherList){
            if (findIdTeacher == teacher.getId()){
                System.out.println(teacher);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy giảng viên có ID: " + findIdTeacher);
        }
    }

    @Override
    public void findByNameTeacher() {
        boolean check = false;
        System.out.println("Nhập tên giảng viên cần tìm: ");
        String findNameTeacher = scanner.nextLine();

        for (Teacher teacher : teacherList){
            if (teacher.getName().contains(findNameTeacher)){
                System.out.println(teacher);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy giảng viên có tên " + findNameTeacher);
        }
    }

    @Override
    public void bubbleSortByNameTeacher() {
        boolean needNextPass = true;
        for (int i = 1; i < teacherList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < teacherList.size() - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }

    public static Teacher infoTeacher(){
        int id;
        while (true){
            try {
                System.out.println("Nhập ID giảng viên: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Teacher teacher : teacherList){
                    if (teacher.getId() == id){
                        throw new DuplicateIDException("Trùng ID, vui lòng nhập lại! ");
                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số nguyên !");
            }catch (DuplicateIDException p){
                System.out.println(p.getMessage());
            }
        }

        System.out.println("Nhập tên giảng viên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh giảng viên: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính giảng viên: ");
        String sex = scanner.nextLine();

        System.out.println("Nhập chuyên môn của giảng viên: ");
        String specialize = scanner.nextLine();

        return new Teacher(id,name,dateOfBirth,sex,specialize);
    }
}
