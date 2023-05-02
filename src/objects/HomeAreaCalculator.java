package objects;
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle(25, 50);
        Rectangle room2 = new Rectangle(30, 75);

        double areaRoom1 = room1.calculateArea();
        double areaRoom2 = room2.calculateArea();
        double total = areaRoom1 + areaRoom2;

        System.out.println("Total area of both rooms: " + total);
    }
}
