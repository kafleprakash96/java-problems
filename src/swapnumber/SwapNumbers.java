package swapnumber;

import java.util.Scanner;

public class SwapNumbers {

    public static void swapNumbers(int a, int b){
        // Add two numbers and set to a
        a = a + b;

        //Subtract b from a and set to b.
        b = a - b;

        //subtract b from a and set to a.
        a = a - b;

        System.out.println("After swapping, First number: " + a + ", Second number: " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        swapNumbers(a,b);
    }

}
