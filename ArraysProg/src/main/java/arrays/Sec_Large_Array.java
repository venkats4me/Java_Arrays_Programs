package arrays;

public class Sec_Large_Array {
    public static void main(String[] args) {
        /*
        Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.
         */
        int[] arr = {10, 10, 10};
        int n=arr.length;
        int F_lar=-1, S_lar=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>F_lar){
                F_lar=arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>S_lar && arr[i]!=F_lar){
                S_lar=arr[i];
            }
        }
        System.out.println("2nd largest==="+S_lar);
    }
}
