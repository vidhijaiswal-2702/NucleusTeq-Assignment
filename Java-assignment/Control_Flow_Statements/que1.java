// 1) Write a program to check if a given number is prime using an if-else statement.
import java.util.Scanner;
public class que1 {
    public static void main(String []args){
     Scanner sc = new Scanner(System.in);

     System.out.print("enter number: ");
     int number = sc.nextInt();

     boolean isPrime = true;

        // Check if the number is prime
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
    
}
