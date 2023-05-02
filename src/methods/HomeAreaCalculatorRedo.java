package methods;

import java.awt.*;
import java.util.Scanner;

//we didn't have to import the Rectangle class.
// It's because Rectangle is in the same package as this current class
public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //in order to call getRoom() without making getRoom() static, we would have to instantiate the very class that we are in
        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculatorRedo.getRoom(); //we'll make a call to a method we haven't defined yet called getRoom().
        Rectangle bathroom = calculatorRedo.getRoom();

        double area = calculatorRedo.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);

        calculatorRedo.scanner.close();

    }
    public Rectangle getRoom() { //This method is not going to return a primitive data type. It's going to return the Rectangle object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();


        return new Rectangle(length, width); //object that contains lots of different data, just return the new instantiation as opposed to storing it in a new object
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
