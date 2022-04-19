package Zad1;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(4);
        Circle circle = new Circle(2.4);
        Triangle triangle = new Triangle(3,5,4);

        Shape[] shapes = {rectangle, square, circle, triangle};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea() + "\n");
            System.out.println(shapes[i].getPerimeter() + "\n");
        }

    }
}
