package arrays;

public class maxSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int count=0;
        int sum=Integer.MIN_VALUE;
        for(int m:arr){
            count=Math.max(m, m+count);
            sum=Math.max(sum, count);
        }
        System.out.println(sum);
    }
}
