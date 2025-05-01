package Lab9.task3;

import Lab8.task4.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shape[] shapes = new Shape[]{circle, square, triangle};
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
