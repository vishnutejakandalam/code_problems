import java.util.Scanner;
class due
{
    public static void main(String[] args) {
        int fine=0;
        int count=0;
        int fee=0,t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            count=0;
            fee=0;
            fine=0;
          int n=s.nextInt();
           int[] a=new int[n];
            for(int j=0;j<n;j++)
            a[j]=s.nextInt();
            int r=1;
           while(r<=n)
            {
               if(a[0]==1)
                {
                  if(fine>=100)
                 fine=fine+100;            
                }
           else if(a[0]==0)
                {
                fine=fine+100;
                 count++;
                  }
                  for(int j=1;j<n;j++)
                  {
                     a[j-1]=a[j];
                     }
                r++;
            }
          fee=fine+count*1000;
            System.out.println(fee);
        }
   s.close();
    }

}