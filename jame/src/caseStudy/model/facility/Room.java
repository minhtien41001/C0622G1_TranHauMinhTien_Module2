package caseStudy.model.facility;

public class Room extends Facility{
    private String accompaniedService;

    public Room() {
    }

    public Room(String name, double area, double cost, int numberPeople, String rentalType, String accompaniedService) {
        super(name, area, cost, numberPeople, rentalType);
        this.accompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "accompaniedService='" + accompaniedService + '\'' +
                '}' + super.toString();
    }
}
