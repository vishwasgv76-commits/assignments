abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r = 5;

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l = 4;
    double b = 3;

    double area() {
        return l * b;
    }
}

class Main1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}