package arrays;
import java.util.Arrays;


public class nonRepeatingelements {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,6,7,4,1};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {

            if((i == 0 || arr[i] != arr[i-1]) &&    
               (i == arr.length-1 || arr[i] != arr[i+1])) {

                System.out.println("Non-repeating: " + arr[i]);
            }
        }
        System.out.println(arr);
    }
}

