package reversestring;

import java.util.Scanner;
/*
    The reverse of String is achieved by using StringBuilder method provided by java.lang
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("The reverse of " + inputString + " is " + reversedString);
    }

    public static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
