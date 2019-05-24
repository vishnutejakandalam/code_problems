import java.util.Scanner;
class rem
{
    public static void main(String[] args) {
        int t,a,b;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            a=s.nextInt();
            b=s.nextInt();
            int q=a/b;
            int r=a-(q*b);
            System.out.println(r);
        }
    }
}