//Write a program to reverse a given string.
import java.util.Scanner;
public class que1 {
     public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
}
    return reversed;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversedString = reverse(input);
        System.out.println("Reversed String: " + reversedString);

        sc.close();
    
}
}
