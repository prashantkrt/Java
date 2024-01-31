package OOPS.Projects.Project3;

import java.util.Scanner;

abstract class Shape {

    float area;

    abstract void input();

    abstract void compute();

    void display() {
        System.out.println("The area is " + area);
    }
}

class Circles extends Shape{
    float radius;

    public void input() {
        System.out.println("Rectangle Calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the radius of the Circle");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;
    }
}

class Rectangles extends Shape {
    float length;
    float breadth;

    public void input() {
        System.out.println("Rectangle Calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the length of the rectangle");
        length = sc.nextFloat();
        System.out.println("Kindly enter the breadth of the rectangle");
        breadth = sc.nextFloat();
    }

    public void compute() {
        area = length * breadth;
    }
}

class Squares extends Shape {
    float length;

    public void input() {
        System.out.println("Rectangle Calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the length of the rectangle");
        length = sc.nextFloat();
    }

    public void compute() {
        area = length * length;
    }
}

class Geometry {
    void permit(Shape shape) {
        shape.input();
        shape.compute();
        shape.display();
    }
}

public class LaunchProject2 {
    public static void main(String[] args) {
        Shape circle = new Circles();
        Shape rectangle = new Rectangles();
        Shape square = new Squares();
        Geometry geometry = new Geometry();
        geometry.permit(circle);
        geometry.permit(rectangle);
        geometry.permit(square);

    }
}
