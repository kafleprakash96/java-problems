package countvowels;

import java.util.Scanner;

public class CountVowelsConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for easy comparison
        String lowerCaseInput = input.toLowerCase();

        for (char ch : lowerCaseInput.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount++;
            } else if (isConsonant(ch)) {
                consonantCount++;
            }
        }

        // Display results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    private static boolean isConsonant(char ch) {
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }
}
