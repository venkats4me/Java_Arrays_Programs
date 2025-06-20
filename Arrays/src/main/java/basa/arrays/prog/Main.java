package basa.arrays.prog;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar={1,8,7,6,9,10};
        for(int i:ar){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println("sorting of a given array");
       // Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println("==Find the sum of all array elements==");
        int[] arr = {80, 20, 60,55, 40, 10};
        int tot=0;
        for (int i = 0; i < arr.length; i++) {
            tot+=arr[i];
        }
        System.out.println("sum=="+tot);
        System.out.println("==Q3: Find the maximum element in the array==");
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max ele=="+max);
        System.out.println("==Find the minimum element in the array==");
        int min=arr[0];
        for (int k:arr){
            if(min>k){
                min=k;
            }
        }
        System.out.println("min==="+min);
        System.out.println("==Search for an element in the array==");
        int serEle=10;
        for (int k:arr){
            if(k==serEle){
                System.out.println("found=="+k);
                break;
            }
        }
        System.out.println("==Reverse an array==\n"+Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}