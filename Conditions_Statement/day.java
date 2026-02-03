package Conditions_Statement;
import java.util.*;
public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int n=sc.nextInt();
    
        switch (n) {
            case 1: System.out.println("monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("wednsday");
                break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("friday");
                break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
                break;
        }
    }
    
}
