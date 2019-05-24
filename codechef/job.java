import java.util.Scanner;
class job
{
    public static void main(String args[])
    {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b;
            a=s.nextInt();
            b=s.nextInt();
            System.out.println(Math.max(a,b)+" "+(a+b));
        }
    }
}