//1) Write a program to find the average of elements in an array.

import java.util.Scanner;
public class que1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }

        double average = (double) sum / n;
        System.out.println("The average of the elements in the array is: " + average);

        sc.close();
    }
}

    

