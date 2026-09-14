package LeetCode;

import java.util.HashSet;

// LeetCode Problem 771: Jewels and Stones

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        // Store all jewel characters in the HashSet
        for (char jewel : jewels.toCharArray()) {
            set.add(jewel);
        }

        int count = 0;

        // Check each stone
        for (char stone : stones.toCharArray()) {

            if (set.contains(stone)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        JewelsAndStones obj = new JewelsAndStones();

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(obj.numJewelsInStones(jewels, stones));
    }

    /*
     * Pattern: HashSet - Checking Existence
     *
     * Approach:
     *
     * 1. Store all characters from "jewels" in a HashSet.
     *
     * 2. Traverse through every character in "stones".
     *
     * 3. Use set.contains() to check whether the current
     *    stone is a jewel.
     *
     * 4. If it is present in the HashSet, increase the count.
     *
     * Example:
     *
     * jewels = "aA"
     * stones = "aAAbbbb"
     *
     * HashSet = {a, A}
     *
     * a -> present -> count = 1
     * A -> present -> count = 2
     * A -> present -> count = 3
     * b -> not present
     * b -> not present
     * b -> not present
     * b -> not present
     *
     * Answer = 3
     *
     * Why HashSet?
     *
     * We only need to check whether a character exists
     * in jewels. We don't need to store any value with it.
     *
     * HashSet is useful when the question is:
     *
     * "Does this element exist?"
     *
     * Time Complexity: O(J + S)
     *
     * J = length of jewels
     * S = length of stones
     *
     * Space Complexity: O(J)
     *
     * The HashSet stores the characters from jewels.
     */
}