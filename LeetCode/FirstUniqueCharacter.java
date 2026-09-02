package LeetCode;

// LeetCode Problem 387: First Unique Character in a String

import java.util.*;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count the frequency of each character
        for(int i = 0; i < s.length(); i++){

            freq[s.charAt(i) - 'a']++;
        }

        // Find the first character whose frequency is 1
        for(int i = 0; i < s.length(); i++){

            if(freq[s.charAt(i) - 'a'] == 1){

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        System.out.println("First unique character index: " + obj.firstUniqChar(s));

        sc.close();
    }
}

// Approach: Count the frequency of each character, then scan the string from left to right.
// Return the index of the first character whose frequency is 1.
// Time Complexity: O(n)
// Space Complexity: O(1)