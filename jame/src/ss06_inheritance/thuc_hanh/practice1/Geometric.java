package ss06_inheritance.thuc_hanh.practice1;

public class Geometric {
    private String color = "blue";
    private String filled = null;

    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
