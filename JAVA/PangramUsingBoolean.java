// Problem: Check Whether a String is a Pangram (Using Boolean)

//Solution

public class PangramUsingBoolean {

    public static void main(String[] args) {

        String str = "thequickbrownfoxjumpsoveralazdo";

        char[] arr = str.toCharArray();

        int[] freq = new int[26];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - 'a']++;
        }

        boolean isPangram = true;

        // Check whether any alphabet is missing
        for (int i = 0; i < 26; i++) {

            if (freq[i] == 0) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram);
    }
}

/*
Problem:
Check whether a given string is a Pangram
using a boolean variable.

Approach:
- Create a frequency array.
- Assume the string is a Pangram.
- Traverse the frequency array.
- If any alphabet is missing,
  set the boolean to false
  and stop checking further.

Key Logic:
boolean isPangram = true;

if(freq[i] == 0){
    isPangram = false;
    break;
}

The break statement immediately exits the loop,
avoiding unnecessary comparisons.

Example 1

Input:
thequickbrownfoxjumpsoveralazydog

Output:
true

Example 2

Input:
thequickbrownfoxjumpsoveralazdo

Output:
false

Time Complexity:
O(n)

Why?
- First loop traverses all characters.
- Second loop checks at most 26 alphabets.
- Due to the break statement, it may stop earlier.
- Therefore,
  O(n + 26) = O(n)

Space Complexity:
O(1)

Why?
- Frequency array size is fixed at 26.
- Uses only one boolean variable.

Advantages:
- Simple and clean.
- Stops checking immediately after finding a missing letter.
- Preferred in coding interviews.

Disadvantages:
- Does not print which letters are missing.
- Does not count missing letters.

When to Use:
- When only checking whether the string is a Pangram.

Comparison with Other Methods:
- More optimized than the Count Method because it can stop early.
- Simpler than the Print Method.
*/
