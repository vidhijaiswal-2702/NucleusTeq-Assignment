// 1) Write a program to calculate the area of a circle, rectangle, or triangle based on user input.
import java.util.Scanner;
 class Area{

    public static double circle(double radius){
        double area = Math.PI * radius * radius;
        return area;
    } 
    public static double rectangle(double l, double b){
       double area = l*b;
        return area;
    }
    public static double triangle(double b,double h){
        double area = 0.5 * b * h;
        return area;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Circle Area
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle: " + circle(radius));

        // Rectangle Area
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of the rectangle: " + rectangle(length,width));

        // Triangle Area 
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of the triangle: " + triangle(base,height));

        sc.close();

    }

 }