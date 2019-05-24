import java.util.Scanner;

class neuron
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            long y;
            int n;
            long st,e;
            int[] w,b;
            int sp=0,nsp=0;
            n=s.nextInt();
            st=s.nextLong();
            e=s.nextLong();
            w=new int[n];
            b=new int[n];
            for(int j=0;j<n;j++)
            {
                w[j]=s.nextInt();
                b[j]=s.nextInt();
            }
            for(long j=st;j<=e;j++)
            {
                y=j;

                for(int q=0;q<n;q++)
                {
                    y=(w[q]*y+b[q]);
                }
                if(y%2==0)
                nsp++;
                else if(y%2==1)
                sp++;
            }
            System.out.println(nsp+"  "+sp);
        }
    }
}