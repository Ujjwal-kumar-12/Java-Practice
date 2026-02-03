package Conditions_Statement;

import java.util.Scanner;

public class greternumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("print a");
        int b=sc.nextInt();
        System.out.println("print b");
        sc.close();
        if(a>b){
            System.out.print("A is greater");
        }else if(a<b){
            System.out.print("B is greater");
        }else{
            System.out.print("A & b both are equal");
        }
    }
    
}
