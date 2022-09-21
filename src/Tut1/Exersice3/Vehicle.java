package Tut1.Exersice3;

public class Vehicle {
    private String name;
    private double width;
    private double length;
    private double height;
    private double weight;

    private String registrationNumber;



    public Vehicle(String name, double width, double length, double height, double weight, String registrationNumber) {
        this.name = name;
        this.width = width;
        if (validateLength(length)){
            this.length = length;
        }

        this.height = height;

        if (validateWeight(weight)){
            this.weight = weight;
        }

        if (validateRegistrationNumber(registrationNumber))
        this.registrationNumber = registrationNumber;
    }


    public boolean validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber.matches("^[a-zA-Z0-9]*$")
         && registrationNumber.length() <= 12 && registrationNumber.length() > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean validateLength(double length){
        return true;
    }

    public boolean validateWeight(double weight){
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "={" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public void travel(Vehicle vehicle, String a, String b, int passengers) {
        char c = '\u10A7';
        char d = '\u00B0';
        String print = "";
        if (this.getClass().getSimpleName().equals("Car")){
            print = c + " "+ this.getClass().getSimpleName() + ": " +
                    "travel from "+ a + " to " + b + " with " + passengers +" passengers";
            System.out.println(print);
        } else if (this.getClass().getSimpleName().equals("Bus")){
            print = d + " "+ this.getClass().getSimpleName() + ": " +
                    "travel from "+ a + " to " + b + " with " + passengers +" passengers";
            System.out.println(print);
        }
//        System.out.println(print);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bently", 500.0, 2.3, 1.5, 1500.0, "29B888999");
        Car car = new Car("Bently", 500.0, 5.3, 1.5, 1500.0, "29B888999");
        Bus bus = new Bus("BWM", 1030.0, 5.0, 2.0, 10000.0, "29A99999");
//        IronSuit ironSuit = new IronSuit("BWM", 1030.0, 5.0, 2.0, 10000.0, "29A99999", "red");
//        ironSuit.fly();


//        System.out.println(vehicle);
////        System.out.println(car);
////        System.out.println(bus);
//
//        car.travel(car, "Tay Ho", "DHHN", 4);
//        bus.travel(bus, "Ha Dong", "Thanh Xuan", 16);
//
//        char c = '\u10A7';
//        System.out.println(c);
    }
}
