import java.util.Scanner;
class dog
{
    public static void main(String args[])
    {
        int n;
        int k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int temp=n;
        while(temp%k!=0)
        {
            temp--;
        }
        if(temp==n)
        {
            n=0;
        }
        else
        n=n-temp;
        System.out.println(n);
    }
}