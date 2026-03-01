package arrays;

public class maxProduct {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int product=0;
        for(int i=0;i<arr.length-1;i++){
            product+=arr[i]*arr[i+1]; 
        }
        System.out.println(product);
   }   
}
