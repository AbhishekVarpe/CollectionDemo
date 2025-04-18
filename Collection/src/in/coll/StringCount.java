package in.coll;

import java.util.HashMap;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to lowercase (optional, for case-insensitive counting)
        input = input.toLowerCase();

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {  // optional: ignore spaces and special chars
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Display the result
        System.out.println("\nCharacter Frequencies:");
        for (char ch : charCountMap.keySet()) {
            System.out.println(ch + " => " + charCountMap.get(ch));
        }

        sc.close();		

	}

}
