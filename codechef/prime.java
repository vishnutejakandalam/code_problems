import java.util.Scanner;
class prime
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int f=0;f<t;f++)
        {
            int count=0;
            int n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=n;j++)
                {
                    if(i*j==n)
                    {
                    count++;
                    }
                }
            }
            if(count==1)
            System.out.println("yes");
            else
            System.out.println("no");
        }
    }
}