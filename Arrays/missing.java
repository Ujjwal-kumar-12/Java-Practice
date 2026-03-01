package arrays;
import java.util.*;
public class missing{
    public static void main(String[] args) {
        // int[] arr={0,1,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range: ");
        int x=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the elements: ");
        String s=sc.nextLine();
        String[] arr=s.split(" ");

        int target=arr.length;
        for(int i=0;i<arr.length;i++){
            target^=i;
            target^=Integer.parseInt(arr[i]);
        }
        System.out.println(target);
    }
}