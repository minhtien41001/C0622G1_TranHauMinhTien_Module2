package caseStudy.model.facility;

public abstract class Facility {
    private String name;
    private double area;
    private double cost;
    private int numberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String name, double area, double cost, int numberPeople, String rentalType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", numberPeople=" + numberPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
