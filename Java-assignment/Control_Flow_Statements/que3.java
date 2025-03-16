// 3) Use a for loop to print a multiplication table.
import java.util.Scanner;
public class que3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}

    

