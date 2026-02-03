package Conditions_Statement;

import java.util.*;
public class vote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n>=18){
            System.out.println("Valid to vote");
        }else{
            System.out.println("not valid");
        }
    }
}
