import java.util.Scanner;
class clean
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int test=0;test<t;test++)
        {
            int temp;
            int n,m;
            n=s.nextInt();
            m=s.nextInt();
            int[] d= new int[m];
            int[] h= new int[n-m];
            for(int i=0;i<m;i++)
            d[i]=s.nextInt();
            for(int i=0;i<m-1;i++)
            {
                for(int j=0;j<m-1;j++)
                {
                    if(d[j]>d[j+1])
                    {
                        temp=d[j];
                        d[j]=d[j+1];
                        d[j+1]=temp;
                    }
                }
            }
            for(int i=1;i<=n;i++)
            {
                int index=0;
                int flag=search(i,d);
                if(flag==0)
                continue;
                else if(flag == 1)
                {
                h[index]=i;
                index++;
                }
            }
            for(int i=0;i<h.length;i++)
            System.out.println(h[i]);
        }
    }
    static int search(int key,int[] d)
    {
        int flag=0,low,high,mid;
        low=0;
        high=d.length-1;
        mid=(low+high)/2;
        while(low<high)
        {
            if(key<d[mid])
            high = mid-1;
            else if(key>d[mid])
            low=mid+1;
            else break;
            mid=(low+high)/2;
           }
        if(d[mid]==key)
         flag=0;
        else if(d[mid]!=key)
        flag= 1;
        return flag;
    }
}