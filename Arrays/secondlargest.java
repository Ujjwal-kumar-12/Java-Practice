package arrays;

public class secondlargest {
   public static void main(String[] args) {
        int[] arr={10,22,4,34,1,2,32};
        int max=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
                if(arr[i]>secondlargest && arr[i]!=max){
                secondlargest=arr[i];
            }
        }   
        System.out.println(max);
        System.out.println(secondlargest);
   } 
}
