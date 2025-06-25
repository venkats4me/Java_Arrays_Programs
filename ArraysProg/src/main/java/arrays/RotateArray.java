package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}, k = 4;
      //  int[] temp=new int[arr.length];
        int j=0;
       /* for (int i = 0; i < arr.length; i++) {
            if(i>d-1){
                temp[j++]=arr[i];
            }
        }
        for (int i = 0; i < d; i++) {
            temp[j++]=arr[i];
        }*/
        //System.out.println(Arrays.toString(temp));

        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
