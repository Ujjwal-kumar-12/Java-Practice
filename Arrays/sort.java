package arrays;

import java.util.*;

public class sort {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size array: ");
        int x=sc.nextInt();
        int[] arr=new int[x];
        System.out.println("Enter array elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        print(arr);
   }
   public static void print(int[] arr){
    for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i] + " ");
    }
   }
}
