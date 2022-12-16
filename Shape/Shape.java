import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Rectangle= 4");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Triangle= 3");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides in Hexagon= 6");
    }
}

class Shapes {
    public static void main(String [] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Triangle();
        Shape s3 = new Hexagon();
        s1.numberOfSides();
        s2.numberOfSides();
        s3.numberOfSides();
    }
}
