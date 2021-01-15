/*
programe name   :   to create "Vehicle" class with required properties.
                    Static varriable initialized by static block.
File Name       :   VehiclePrograme2.java
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Vehicle {
    String chesisNo;
    String engineNo;
    String brand;
    String variant;
    String model;
    static String color;

    static {
        color = "BLACK";
    }

    Vehicle(String chesisNo, String engineNo, String brand, String variant, String model, String newColor) {
        this.chesisNo = chesisNo;
        this.engineNo = engineNo;
        this.brand = brand;
        this.variant = variant;
        this.model = model;
        color = newColor;
    }

    void display() {
        System.out.println("Chesis Number: " + chesisNo);
        System.out.println("Engine Number: " + engineNo);
        System.out.println("Brand: " + brand);
        System.out.println("Variant: " + variant);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

class VehiclePrograme2 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t---VEHICLE INFO---");
        System.out.print("Chesis Number: ");
        String chesisNo = buf.readLine();
        System.out.print("Engine Number: ");
        String engineNo = buf.readLine();
        System.out.print("Brand: ");
        String brand = buf.readLine();
        System.out.print("variant: ");
        String variant =  buf.readLine();
        System.out.print("Model: ");
        String model = buf.readLine();
        System.out.print("Color: ");
        String color = buf.readLine();

        Vehicle obj1 = new Vehicle(chesisNo, engineNo, brand, variant, model, color);

        System.out.println("\t---VEHICLE INFO DISPLAY---");
        obj1.display();
    }
}
