package Homework;
public class Rectangle implements Shape{

    int width;
    int length;

    public Rectangle(int length, int width) {
        this.width = width;
        this.length = length;
    }
    public double findArea() {

        return width*length;
    }
    public double findPerimeter() {

        return 2*(width+length);
    }
}
