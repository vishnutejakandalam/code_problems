import java.util.Scanner;
class ar
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int t;
        n=s.nextInt();
        t=s.nextInt();
        int[] ary=new int[n];
        for(int a=0;a<ary.length;a++)
        ary[a]=0;
        int[] i=new int[t];
        int[] j=new int[t];
        int[] f=new int[t];
        for(int m=0;m<t;m++)
               {
                   i[m]=s.nextInt();
                   j[m]=s.nextInt();
                   f[m]=s.nextInt();
                }
        for(int m=0;m<t;m++)
        {
            for(int me=i[m]-1;me<=j[m]-1;me++)
            {
                ary[me]=ary[me]+f[m];
            }        }
        for(int je=0;je<ary.length;je++)
        System.out.print("  "+ary[je]);
    }
}