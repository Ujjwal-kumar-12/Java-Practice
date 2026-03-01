package arrays;
// question: print random even number within the range of two given numbers
import java.util.Random;
import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        System.out.println("Enter the first number:");
        int a=sc.nextInt();

        System.out.println("enter the second number:");
        int b=sc.nextInt();

        int min=Math.min(a,b);
        int max=Math.max(a,b);

        if(min%2!=0){
            min++;
        }
        if(max%2!=0){
            max--;
        }
        if(min > max){
            System.out.println("Out of range.");
        }else{
            int count=((max-min)/2)+1;
            int randomEven= min+(2*random.nextInt(count));
            System.out.println("RandomEven number:" + randomEven);
        }
    }
}
