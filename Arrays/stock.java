package arrays;

public class stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>max){
                max += arr[i]-arr[i-1];
            }
        }
        System.out.println(max);
    }
}
