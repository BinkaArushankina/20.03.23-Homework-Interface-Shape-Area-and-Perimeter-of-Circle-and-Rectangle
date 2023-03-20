package Homework;
public class Main {
    public static void main(String[] args) {
        //Создать интерфейс Shape, содержащий методы для подсчета периметра и площади фигуры.
        //Создать классы Circle и Rectangle, имплементирующие этот интерфейс для круга и прямоугольника.
        //В методе main класса Main создать несколько обьектов этих классов и вывести на экран площади и периметры фигур.

        Shape circle = new Circle(5);

        System.out.println("The area of the circle is "+circle.findArea());
        System.out.println("The perimeter of the circle is "+circle.findPerimeter());

        Shape rectangle = new Rectangle(5,10);

        System.out.println("The area of the rectangle is "+rectangle.findArea());
        System.out.println("The perimeter of the rectangle is "+rectangle.findPerimeter());
    }
    /*
The area of the circle is 78.5
The perimeter of the circle is 31.400000000000002
The area of the rectangle is 50.0
The perimeter of the rectangle is 30.0
     */
}
