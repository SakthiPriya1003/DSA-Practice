package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

// LeetCode Problem 1207: Unique Number of Occurrences

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        // Check whether each frequency is unique
        for (int frequency : map.values()) {

            if (set.contains(frequency)) {
                return false;
            }

            set.add(frequency);
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};

        UniqueOccurrences obj = new UniqueOccurrences();

        boolean ans = obj.uniqueOccurrences(arr);

        System.out.println("Unique Occurrences: " + ans);
    }
}

// Approach: Use a HashMap to count the occurrences of each value.

// Then use a HashSet to store the frequencies that have already appeared.

// If a frequency is already present in the HashSet, two different values
// have the same number of occurrences, so return false.

// If all frequencies are unique, return true.

// Time Complexity: O(n)

// Space Complexity: O(n)