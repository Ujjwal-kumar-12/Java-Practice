package Arrays;

import java.util.Scanner;

//Question : Search the element exists in array or not

public class search {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,55,60};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }
        if(flag==true){
                System.out.println("Element exists in array");
            }else{
                System.out.println("Elements doesnt exists in array");
            }
    }
    
}
