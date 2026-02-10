package arrays;

import java.util.Arrays;
public class duplicate {
    public static void main(String[] args) {
        int[] x={1,3,5,7,9,10,1,2,3};
        Arrays.sort(x);
        int count=1;
        for(int i=1;i<x.length;i++){
            if(x[i]!=x[i-1]){
                count++;
            }
        }
        int[] arr=new int[count];
        arr[0]=x[0];
        int index=1;
        for(int i=1;i<x.length;i++){
            if(x[i]!=x[i-1]){
                arr[index++]=x[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
