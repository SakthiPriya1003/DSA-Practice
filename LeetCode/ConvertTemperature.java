package LeetCode;

// LeetCode Problem 2469: Convert the Temperature

public class ConvertTemperature {

    public double[] convertTemperature(double celsius) {

        double[] arr = new double[2];

        arr[0] = celsius + 273.15;
        arr[1] = celsius * 1.80 + 32.00;

        return arr;
    }

    public static void main(String[] args) {

        double celsius = 36.50;

        ConvertTemperature obj = new ConvertTemperature();

        double[] ans = obj.convertTemperature(celsius);

        System.out.println("Kelvin: " + ans[0]);
        System.out.println("Fahrenheit: " + ans[1]);
    }
}

// Approach: Convert the given Celsius temperature into Kelvin and Fahrenheit
// using the given conversion formulas.

// Kelvin = Celsius + 273.15

// Fahrenheit = Celsius * 1.80 + 32.00

// Store both converted values in an array and return the array.

// Time Complexity: O(1)

// Space Complexity: O(1)
