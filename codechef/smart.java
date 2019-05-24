import java.util.Scanner;

class smart
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,q;
            n=s.nextInt();
            q=s.nextInt();
            int[] d=new int[n];
            int[] x=new int[q];
            for(int j=0;j<n;j++)
            d[j]=s.nextInt();
            for(int k=0;k<q;k++)
            x[k]=s.nextInt();
           for(int j=0;j<q;j++)
           {
               int qw=d[j];
               for(int k=0;k<n;k++)
               qw=x[k]/qw;
               System.out.print("  "+qw+"  ");
           }
        }
    }
}