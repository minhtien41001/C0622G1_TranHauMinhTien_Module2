package ss5_static_accessModifier.bai_tap.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Trần Hậu Minh Tiến");
        student.setClasses("C0622G1");

        String fullName = student.getName();
        String className = student.getClasses();

        System.out.printf("Thông tin học viên:\n Tên: %s,Lớp: %s ",fullName,className);
    }
}
