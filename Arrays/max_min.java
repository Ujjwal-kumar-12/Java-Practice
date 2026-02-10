package arrays;

import java.util.*;

public class max_min{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String s=sc.nextLine();
        sc.close();
        String[] arr=s.split(" ");
        int min=Integer.parseInt(arr[0]);
        int max=Integer.parseInt(arr[0]);
        for(String val:arr){
            int num=Integer.parseInt(val);
            if(num<min){
                min=num;
            }if(num>max){
                max=num;

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}