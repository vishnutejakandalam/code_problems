import java.util.Scanner;
class mahasena
{
   public static void main(String args[])
   {
       int n,e=0,o=0;
       int[] a;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       a=new int[n];
       for(int i=0;i<a.length;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            e++;
            else
            o++;
        }
        if(e>o)
        {
            System.out.printf("READY FOR BATTLE");
        }
        else
        System.out.println("NOT READY");
   }
}