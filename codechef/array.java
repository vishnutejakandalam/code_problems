import java.util.Scanner;
class array
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int loop=0;loop<t;loop++)
        {
            int cost=0;
            int n;
            n=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            a[i]=s.nextInt();
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>a[i+1])
             {
                a[i]=0;
                cost=cost+a[i+1];
            }
                else if(a[i+1]>a[i])
                {
                a[i+1]=0;
                cost=cost + a[i];
                }
            }
        System.out.println(cost);
        }
    }
}