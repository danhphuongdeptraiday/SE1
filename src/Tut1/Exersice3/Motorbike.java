package Tut1.Exersice3;

public class Motorbike extends Vehicle{
    private int wheel;

    public Motorbike(String name, double width,double length, double height, double weight, String registrationNumber, int wheel){
        super(name, width, length, height, weight, registrationNumber);
        this.wheel = wheel;
    }

    public void bocDau() {
        System.out.println("Xe may co the boc dau with "+ this.wheel);
    }
}
