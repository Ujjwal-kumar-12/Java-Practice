package Star_Pattern_problems;

public class hollow {
    public static void main(String[] args) {
        char ch='*';
        int n=4;
        int m=5;
        //row
        for(int i=1;i<=n;i++){
            //columns
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){  //void or hollow
                    System.out.print(ch);
                }else{
                    System.out.print(" ");   //space for hollow
                }
            }
            System.out.println( );
        }
    }   
}
