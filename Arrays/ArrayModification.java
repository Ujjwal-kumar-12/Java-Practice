package Arrays;

/* 
Question : multiple odd index elemets by 2 and add even index by 10
testcase: {10,20,30,40,50,60} solution: {20,40,40,80,120}
*/

public class ArrayModification {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            if(i %2==0){
                System.out.println(arr[i]*2);
            }if(i%2!=0){
                System.out.println(arr[i]+10);
            }
        }
    }
    
}
