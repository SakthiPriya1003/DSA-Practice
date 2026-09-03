package LeetCode;

// LeetCode Problem 1672: Richest Customer Wealth

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {

        int max = 0;

        for(int i = 0; i < accounts.length; i++){

            int wealth = 0;

            for(int j = 0; j < accounts[i].length; j++){

                wealth += accounts[i][j];

                max = Math.max(max, wealth);

            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        RichestCustomerWealth obj = new RichestCustomerWealth();

        int ans = obj.maximumWealth(accounts);

        System.out.println("Maximum Wealth: " + ans);

    }

}

// Approach: Traverse each customer's accounts and calculate their total wealth.

// Update the maximum wealth while calculating each customer's balance.

// Time Complexity: O(m × n)

// Space Complexity: O(1)