package bai_tap_them_HaiTT_1.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialize) {
        super(id, name, dateOfBirth, sex);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getSpecialize());
    }

    @Override
    public String toString() {
        return "Teacher{"+ super.toString() +
                ", specialize='" + specialize + '\'' +
                '}' ;
    }
}
