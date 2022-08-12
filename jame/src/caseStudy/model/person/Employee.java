package caseStudy.model.person;

public class Employee extends Person{
    private String level;
    private String location;
    private String wage;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String sex, int numberCMND,
                    int phoneNumber, String email, String level, String location, String wage) {
        super(id, name, dateOfBirth, sex, numberCMND, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{"+ super.toString() +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                '}' ;
    }
}
