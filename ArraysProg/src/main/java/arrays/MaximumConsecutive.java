package arrays;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int[] arr={0, 0, 0, 0,1};
        int n=arr.length;
        int maxct=0,cnt=1;
        for (int i = 1; i < n; i++) {
            if(arr[i]==arr[i-1]){
             cnt++;
            }else {
                maxct=Math.max(maxct,cnt);
                cnt=1;
            }
        }
        System.out.println(Math.max(maxct,cnt));
    }
}
