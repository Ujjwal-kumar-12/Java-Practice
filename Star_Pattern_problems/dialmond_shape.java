package Star_Pattern_problems;

public class dialmond_shape {
    public static void main(String[] args) 
    {
        char c='*';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(c);
        }
        System.out.println();
    }
    for(int m=4;m>=1;m--)
        {
        for(int n=1;n<=5-m;n++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*m-1;l++) {
            System.out.print(c);
            }
        System.out.println();
        }
    }
}
