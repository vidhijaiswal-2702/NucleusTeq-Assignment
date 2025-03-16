// 2) Create a program to check if a number is even or odd.

import java.util.Scanner;
class evenOdd {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("Even number");

        }
        else{
            System.out.println("Odd number");
        }

        sc.close();
    }
    
}
