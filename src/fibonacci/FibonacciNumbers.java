package fibonacci;

import java.util.Scanner;

/*
The Fibonacci numbers form a sequence of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
    0 1 1 2 3 5 8 13
 */
public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms in fibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();

        if(numberOfTerms<=0){
            System.out.println("No of terms should be positive integer");
        }else{
            System.out.println("Fibonacci sequence for " + numberOfTerms + " terms is :");
            printFibonacciSequence(numberOfTerms);
        }
    }

    public static void printFibonacciSequence(int n){
        //First two numbers of fibonacci sequence
        int a = 0, b=1;

        //Print the first two numbers
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n;i++){
            int nextNum = a + b ;
            System.out.print(nextNum + " ");
            a = b;
            b = nextNum;
        }
    }
}
