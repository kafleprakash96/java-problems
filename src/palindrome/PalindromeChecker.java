package palindrome;
/*
    A palindrome is a word, number, phrase, or other sequence of symbols
    that reads the same backwards as forwards, such as madam or racecar, the date "22/02/2022"

    It can also be a sentence: A man, a plan, a canal – Panama
 */

/*
    Steps:
    1. Get the input
    2.Normalize to lower case to prevent case-sensitive error
    3.Set start and end point for input
    4. Check characters. while start is less than end.
        check for first and last character. If not alphanumeric, increase the start and decrease the endpoint.

        If alphanumeric, compare both. If equal, increase the start and decrease the endpoint.
        if not return false as the input is not palindrome
 */

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean checkPalindrome(String str){

        str = str.toLowerCase();
        int startPoint = 0;
        int endPoint = str.length()-1;

        while(startPoint < endPoint){
            //Skip non-alphanumeric
            if(!Character.isLetterOrDigit(str.charAt(startPoint))){
                startPoint++;
            }
            else if (!Character.isLetterOrDigit(str.charAt(endPoint))){
                endPoint--;
            }else{
                //compare characters
                if(str.charAt(startPoint) != str.charAt(endPoint)){
                    return false;
                }
                startPoint++;
                endPoint--;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check for palindrome");
        String inputString = scanner.nextLine();
        boolean status = checkPalindrome(inputString);
        if(status)
            System.out.println("String " + inputString + " is Palindrome");
        else
            System.out.println("String " + inputString + " is not Palindrome");
    }
}
