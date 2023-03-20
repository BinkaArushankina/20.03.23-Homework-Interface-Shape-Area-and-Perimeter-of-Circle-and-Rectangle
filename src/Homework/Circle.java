package Homework;
public class Circle implements Shape{
    double area;
    double pi;
    double radius;
    double perimeter;
    public Circle(int radius){
        this.area=0;
        this.pi=3.14;
        this.radius=radius;
        this.perimeter=0;
    }
    public double findArea() {
        area=pi*radius*radius;
        return area;
    }
    public double findPerimeter() {
        perimeter=2*pi*radius;
        return perimeter;
    }
}
