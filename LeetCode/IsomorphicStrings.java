package LeetCode;

import java.util.HashMap;

// LeetCode Problem 205: Isomorphic Strings

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // If a is already mapped, check the mapping
            if (map.containsKey(a)) {

                if (map.get(a) != b) {
                    return false;
                }
            } 
            else {

                // Make sure b is not already mapped to another character
                if (map.containsValue(b)) {
                    return false;
                }

                map.put(a, b);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        IsomorphicStrings obj = new IsomorphicStrings();

        String s = "egg";
        String t = "add";

        System.out.println(obj.isIsomorphic(s, t));
    }

    /*
     * Pattern: HashMap
     *
     * Approach:
     * Store the mapping from each character in s to t.
     * If the same character gets a different mapping, return false.
     * Also make sure two characters in s don't map to the same
     * character in t.
     *
     * Example:
     * s = "egg", t = "add"
     *
     * e -> a
     * g -> d
     * g -> d
     *
     * Valid mapping, so return true.
     *
     * Time: O(N)
     * Space: O(N)
     */
}