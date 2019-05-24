import java.util.Scanner;
class seq
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int te=0;te<t;te++)
        {
            int n,ne=0;
            int count=0;
            int no=0;
            int[] a;
            n=s.nextInt();
            a=new int[n];
            for(int f=0;f<n;f++)
            a[f]=s.nextInt();
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0)
                ne++;
                else 
                no++;
            }
            if((ne%2)==0&&(no%2==0))
            count=1;
            else if((ne%2==0)&&(no%2==1))
            count = 2;
            else if((ne%2==1)&&(no%2==0))
            count = 1;
            else if((ne%2==1) && (no%2==1))
            count = 2;
            System.out.println(count);
        }
    }
}