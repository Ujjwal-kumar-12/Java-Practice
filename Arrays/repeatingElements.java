package arrays;

import java.util.Arrays;

public class repeatingElements {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,7,6,5,1};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
            System.out.println("RepeatedElements: " + arr[i]);
        }
        }
        System.out.println(arr);
    }
    
}
