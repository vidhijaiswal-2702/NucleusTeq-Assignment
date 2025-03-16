// 2) Write a program to demonstrate the use of arithmetic, logical, and relational operators.


import java.util.Scanner;
public class que2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Arithmetic operators
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        // Logical operators
        System.out.println("\nLogical Operators:");
        System.out.println("num1 > 0 && num2 > 0: " + (num1 > 0 && num2 > 0));
        System.out.println("num1 > 0 || num2 > 0: " + (num1 > 0 || num2 > 0));
        System.out.println("!(num1 > num2): " + !(num1 > num2));

        sc.close();
    }
}

    

