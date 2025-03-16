// 2) Implement a program to find the largest number among three given numbers using a conditional statement.
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }

        sc.close();
    }
}
