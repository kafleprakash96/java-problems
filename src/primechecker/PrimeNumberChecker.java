package primechecker;

import java.util.Scanner;

public class PrimeNumberChecker {

    static boolean isPrime(int num){
        if (num == 2)
            return true;
        if(num <=1 || num % 2 == 0)
            return false;
        for(int i = 3; i<Math.sqrt(num); i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int input = sc.nextInt();
        boolean result = isPrime(input);
        if (result) {
            System.out.println("Number " + input + " is prime");
        }
        else{
            System.out.println("Entered number is not prime");
        }
    }
}
