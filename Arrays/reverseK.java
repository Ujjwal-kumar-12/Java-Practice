package arrays;

import java.util.Scanner;

public class reverseK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        char[] arr=s.toCharArray();
        int left=k;
        int right=arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("new string: " + new String(arr));
    }
}
    
