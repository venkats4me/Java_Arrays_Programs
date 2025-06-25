package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Second Largest Element in an Array");
        int arr[] = {10, 10, 10};//{12, 35, 1, 10, 34, 1};
        System.out.println(Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().getAsInt());
        System.out.println("logic 1");
        //Arrays.sort(arr);
       // System.out.println(arr[arr.length-2]);
        System.out.println("2nd logic");
        int larg=-1,sec_large=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>larg)
                larg=arr[i];
        }
        System.out.println(larg+"==="+sec_large);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>sec_large&&arr[i]!=larg){
                sec_large=arr[i];
            }
        }
        System.out.println(larg+"==="+sec_large);
        System.out.println("find the 3rd largest ele");
        int arr_3[] = {-10, -3, -5, -6, -20};//{1, 14, 2, 16, 10, 20};
        int f_lar=Integer.MIN_VALUE,s_lar=Integer.MIN_VALUE,trd_lar=Integer.MIN_VALUE;
        for (int i = 0; i < arr_3.length; i++) {
            if(arr_3[i]>f_lar){
                f_lar=arr_3[i];
            }
        }
        for (int i = 0; i < arr_3.length; i++) {
            if(arr_3[i]>s_lar&&arr_3[i]<f_lar){
                s_lar=arr_3[i];
            }
        }
        for (int i = 0; i < arr_3.length; i++) {
            if(arr_3[i]>trd_lar&&arr_3[i]<s_lar){
                trd_lar=arr_3[i];
            }
        }
        System.out.println(f_lar+"==="+s_lar+"===="+trd_lar);
    }
}