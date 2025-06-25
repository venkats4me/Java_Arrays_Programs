package arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveZerosToEnd {
    public static void main(String[] args) {
      int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        /*  Object[] array = Arrays.stream(arr).boxed().sorted((a, b) -> b - a)
                .map(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(array));
        Object[] array1 = Arrays.stream(arr).boxed().sorted((a, b) -> b - a)
                .toArray();
        System.out.println(Arrays.toString(array1)); ll=
        LinkedList<Integer> ll=new LinkedList<Integer>();
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};*/
        List<Integer> l=new ArrayList<>();
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i:arr){
            if(i==0){
                ll.addLast(i);
            }else {
                l.add(i);
            }
        }
        l.addAll(ll);
        System.out.println(ll.size()==0?"no change":l);
        System.out.println("logic 2");
       List<Integer> lll=new ArrayList<>();
       int cnt=0;
        for (int i:arr) {
            if(i!=0){
               lll.add(i);
            }else {
               cnt++;
            }
        }
        for (int i=0;i<cnt;i++){
            lll.add(0);
        }
        System.out.println(lll);
        System.out.println("logic 3");
        int[] temp=new int[arr.length];
        int j = 0;
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]!=0){
             temp[j++]=arr[i];
         }
        }
        System.out.println(Arrays.toString(temp));
    }
}