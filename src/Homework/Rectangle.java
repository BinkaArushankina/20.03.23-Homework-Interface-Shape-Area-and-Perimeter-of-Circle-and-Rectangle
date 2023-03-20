package Homework;
public class Rectangle implements Shape{
    int perimeter;
    int a;
    int b;
    int area;
    public Rectangle(int a, int b) {
        this.perimeter = 0;
        this.a = a;
        this.b = b;
        this.area = 0;
    }
    public double findArea() {
        area=a*b;
        return area;
    }
    public double findPerimeter() {
        perimeter=2*(a+b);
        return perimeter;
    }
}
