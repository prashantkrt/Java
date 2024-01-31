package OOPS.Projects.Project3;

import java.util.Scanner;

class Rectangle {
    float length;
    float breadth;
    float area;

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

    public void display() {
        System.out.println("The area is " + area);
    }
}

class Square {
    float length;
    float area;

    public void input() {
        System.out.println("Rectangle Calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the length of the rectangle");
        length = sc.nextFloat();
    }

    public void compute() {
        area = length * length;
    }

    public void display() {
        System.out.println("The area is " + area);
    }
}

class Circle {
    float radius;
    float area;

    public void input() {
        System.out.println("Rectangle Calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the radius of the rectangle");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

    public void display() {
        System.out.println("The area is " + area);
    }
}

public class LaunchProject {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle c = new Circle();

        rec.input();
        rec.compute();
        rec.display();

        sq.input();
        sq.compute();
        sq.display();

        c.input();
        c.compute();
        c.display();
    }
}
