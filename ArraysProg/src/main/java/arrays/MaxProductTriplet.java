package arrays;

import java.util.Arrays;

public class MaxProductTriplet {

    public static int maxProductOfTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1;

        Arrays.sort(arr); // Sort the array in ascending order

        // Max product will be either:
        // 1. Product of top 3 numbers
        int prod1 = arr[n - 1] * arr[n - 2] * arr[n - 3];

        // 2. Product of 2 smallest numbers (may be negative) and the largest number
        int prod2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(prod1, prod2);
    }

    public static void main(String[] args) {
        System.out.println(maxProductOfTriplet(new int[]{10, 3, 5, 6, 20}));      // 1200
        System.out.println(maxProductOfTriplet(new int[]{-10, -3, -5, -6, -20})); // -90
        System.out.println(maxProductOfTriplet(new int[]{1, -4, 3, -6, 7, 0}));   // 168
    }
}

