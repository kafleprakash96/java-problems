package patterns;

import java.util.Scanner;

public class Patterns {

    // Method to print Pyramid Pattern
    public static void printPyramid(int rows) {
        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print Diamond Pattern
    public static void printDiamond(int rows) {
        System.out.println("Diamond Pattern:");
        // Upper half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print Pascal's Triangle
    public static void printPascalsTriangle(int rows) {
        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for patterns: ");
        int rows = scanner.nextInt();

        printPyramid(rows);
        System.out.println();
        printDiamond(rows);
        System.out.println();
        printPascalsTriangle(rows);

        scanner.close();
    }
}
