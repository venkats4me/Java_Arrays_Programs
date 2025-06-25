package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ReduceArray {

    public static int reduceToOne(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(arr);
        // Add all elements to max heap
        for (int num : arr) {
            maxHeap.add(num);
        }

        // Repeat until one or zero elements remain
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll(); // largest
            int second = maxHeap.poll(); // second largest

            int diff = Math.abs(first - second);
            if (diff > 0) {
                maxHeap.add(diff);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(reduceToOne(new int[]{5,6,7}));      // ➜ 2
     //   System.out.println(reduceToOne(new int[]{10, 10, 10}));   // ➜ 10
       // System.out.println(reduceToOne(new int[]{7, 7, 7, 7}));   // ➜ 0
     //   System.out.println(reduceToOne(new int[]{1, 1, 1}));      // ➜ 1
      //  System.out.println(reduceToOne(new int[]{}));             // ➜ 0
    }
}

