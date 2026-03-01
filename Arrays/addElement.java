package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        int add=sc.nextInt();
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=add){
                int[] arr1=new int[add];
                System.out.println(arr1);
            } 
        }
    }
}
