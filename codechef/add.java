import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        int a,b,t;
        Scanner s=new Scanner(System.in); 
        t=s.nextInt();
        int[] r=new int[t];
        for(int i=0;i<t;i++)
        {
            a=s.nextInt();
            b=s.nextInt();
            r[i]=a+b;
        }
        for(int i=0;i<t;i++)
        System.out.println(r[i]);
    }
}
