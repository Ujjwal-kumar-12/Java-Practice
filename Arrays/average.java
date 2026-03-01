package arrays;


public class average {
    public static void main(String[] args){
       int[] arr={2,4,5,7,8,9,1};
       int avg=0;
       int sum=0;

       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        int n=arr.length;
        avg=sum/n;

       } 
       System.out.println(sum);
       System.out.println(avg);
    }
}




