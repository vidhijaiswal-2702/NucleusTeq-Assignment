// 4) Create a program to calculate the sum of even numbers from 1 to 10 using a while loop.

public class que4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 10) {
            if (num % 2 == 0) {
                sum += num; 
            }
            num++;
        }
        System.out.println("The sum of even numbers from 1 to 10 is: " + sum);
    }
    
}
