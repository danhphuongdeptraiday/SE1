package Tut1.Exersice3;

import java.util.Random;
import java.util.Scanner;

public class IronSuit extends Vehicle {
    private String color;

    public IronSuit(String name, double width, double length, double height, double weight, String registrationNumber, String color) {
        super(name, width, length, height, weight, registrationNumber);
        this.color = color;
    }

    public void fly() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point A");
        String placeA = sc.nextLine();
        System.out.println("Enter point B");
        String placeB = sc.nextLine();

        System.out.println("Enter distance: ");
        int n = sc.nextInt();

        String print = placeA + " ";
        System.out.println();
        System.out.print(placeA + " ");
        for (int i = 0; i <= n; i++){

            try {
                System.out.print(".");

                Thread.sleep(100);
//                print += ".";

            } catch (InterruptedException e){

            }
        }
        System.out.print(" " + placeB);
    }
}
