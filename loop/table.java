package loop;

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for(int i=2;i<10;i++){
            System.out.println(i*n);
        }
    }
}
