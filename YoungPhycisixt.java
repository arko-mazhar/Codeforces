import java.util.Scanner;
public class YoungPhycisixt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter number of test cases");
        int n=sc.nextInt();
        int sumx=0;
        int sumy=0;
        int sumz=0;
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            sumx=sumx+x;
            sumy=sumy+y;
            sumz=sumz+z;
        }
        if(sumx==0&&sumy==0&&sumz==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}