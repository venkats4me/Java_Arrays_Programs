package arrays;

public class Find_3rdLarg_Array {
    public static void main(String[] args) {
        /*
        Given an array of n integers, the task is to find the third largest element. All the elements in the array are distinct integers.

Examples :

Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14

Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16
Explanation: Largest element is 20, second largest element is 19 and third largest element is 16
         */
        int arr[] = {19, -10, 20, 14, 2, 16, 10};
        int f_lar=Integer.MIN_VALUE,s_lar=Integer.MIN_VALUE,t_lar=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>f_lar)f_lar=arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>s_lar&&arr[i]<f_lar){
                s_lar=arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>t_lar&&arr[i]<s_lar){
                t_lar=arr[i];
            }
        }
        System.out.println(f_lar+"=="+s_lar+"==="+t_lar);
    }
}
