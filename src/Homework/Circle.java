package Homework;
public class Circle implements Shape{

    double radius;

    public Circle(int radius){
        this.radius=radius;
    }
    public double findArea() {

        return Math.PI*radius*radius;
    }
    public double findPerimeter() {

        return 2*Math.PI*radius;
    }
}
