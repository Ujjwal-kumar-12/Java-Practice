package arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,-3};
        int target=2;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("true");
                }
            }
        }
    }
}
