package arrays;

public class Triplet_Array {
    public static void main(String[] args) {
        /*
        Maximum product of a triplet (subsequence of size 3) in array
Last Updated : 12 Feb, 2025
Given an integer array, find a maximum product of a triplet in the array.

Examples:

Input:  arr[ ] = [10, 3, 5, 6, 20]
Output: 1200
Explanation: Multiplication of 10, 6 and 20

Input:  arr[ ] =  [-10, -3, -5, -6, -20]
Output: -90

Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
Output: 168
         */
        int[] arr = {1, -4, 3, -6, 7, 0};
        int f_lar=Integer.MIN_VALUE,s_lar=Integer.MIN_VALUE,t_lar=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>f_lar)f_lar=arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>s_lar&&arr[i]<f_lar){
                s_lar=arr[i];
            }
        }for (int i = 0; i < n; i++) {
            if(arr[i]>t_lar&&arr[i]<s_lar){
                t_lar=arr[i];
            }
        }
        System.out.println("Triplet of the array=="+(f_lar*s_lar*t_lar));
    }
}
