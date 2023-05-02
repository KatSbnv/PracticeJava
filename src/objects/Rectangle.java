package objects;

/* Write a class that describes the fields and methods
of a rectangle.
Write another class that create the instances of the Rectangle class
to find the total area of two rooms in a house*/

public class Rectangle {

    private double length; //No other code outside this class can access things that are marked as private
    private double width;

   public double calculatePerimeter() {
        return (length + width) * 2;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double calculateArea() {
        return length * width;
    }

//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    public Rectangle(double length, double width){
       this.length = length; //can be set this way
       setWidth(width); //or this way
    }
}
