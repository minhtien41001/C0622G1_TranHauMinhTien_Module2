package caseStudy.model.person;

public abstract class Person {

//    Mã nhân viên, Họ tên, Ngày sinh,
//    Giới tính, Số CMND, Số Điện Thoại, Email
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int numberCMND;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String sex, int numberCMND, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.numberCMND = numberCMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(int numberCMND) {
        this.numberCMND = numberCMND;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", numberCMND=" + numberCMND +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email
                ;
    }
}
