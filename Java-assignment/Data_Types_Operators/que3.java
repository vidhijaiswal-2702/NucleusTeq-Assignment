// Program to Convert Temperature Between Celsius and Fahrenheit
import java.util.Scanner;
public class que3 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Celsius to Fahrenheit conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    
            // Fahrenheit to Celsius conversion
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitInput = sc.nextDouble();
            double celsiusConverted = (fahrenheitInput - 32) * 5 / 9;
            System.out.println(fahrenheitInput + " Fahrenheit = " + celsiusConverted + " Celsius");

            sc.close();
        }
}

    


    

