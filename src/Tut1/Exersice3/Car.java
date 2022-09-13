package Tut1.Exersice3;

public class Car extends Vehicle {

    public Car(String name, double width,double length, double height, double weight, String registrationNumber){
        super(name, width, length, height, weight, registrationNumber);

    }

    @Override
    public boolean validateLength(double length) {
        if (length >= 1.5 && length <= 3.5){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean validateWeight(double weight) {
        if (weight >= 1000.0 && weight <= 2000.0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber.matches("^[a-zA-Z0-9]*$") && registrationNumber.length() <= 6){
            return true;
        }else {
            return false;
        }
    }
}
