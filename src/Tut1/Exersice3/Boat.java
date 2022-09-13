package Tut1.Exersice3;

public class Boat extends Vehicle {
    private String area;

    public Boat(String name, double width,double length, double height, double weight, String registrationNumber, String area){
        super(name, width, length, height, weight, registrationNumber);
        this.area = area;

    }

    public void area() {
        System.out.println("No co the boi o "+ this.area);
    }
}
