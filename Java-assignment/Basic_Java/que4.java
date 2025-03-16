// 4) Write a program to print the Fibonacci sequence up to a specified number.
import java.util.Scanner;
public class que4 {

    static void fibonacci(int n){
        int num1=0; int num2=1;
        for(int i=0;i<n;i++){

           
        System.out.println(num1+" ");

        int num3 = num2+num1;
        num1=num2;
        num2=num3;
        }
 }
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        fibonacci(number);

        sc.close();
    }
}
