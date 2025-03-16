// 3) Implement a program to find the factorial of a given number.
import java.util.Scanner;
public class que3 {

    static int factorial(int n){
        int res =1 ;
        for(int i=2;i<=n;i++){
            res = res*i;
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("The factorial of "+ number  + " is: " + factorial(number));

    sc.close();
    }

    
}
