package Star_Pattern_problems;

public class advPattern {
    public static void main(String[] args) {
        char ch='*';
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k>=2*n-i;k++){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int m=n;m>=1;m--)
        {
        for(int i=1;i<=5-m;i++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*n-1;l++) {
            System.out.print(ch);
            }
        System.out.println();
        }
    }
}
