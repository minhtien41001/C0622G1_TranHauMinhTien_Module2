package bai_tap_them_HaiTT_1.service.impl;

import bai_tap_them_HaiTT_1.model.Student;
import bai_tap_them_HaiTT_1.model.Teacher;
import bai_tap_them_HaiTT_1.service.ITeacherService;

import java.util.ArrayList;
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

    public static Teacher infoTeacher(){
        System.out.println("Nhập ID giảng viên: ");
        int id = Integer.parseInt(scanner.nextLine());

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
