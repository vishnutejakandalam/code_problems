import java.util.Scanner;
class rop
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int r=0;r<t;r++)
        {
            int a,b;
            a=s.nextInt();
            b=s.nextInt();
            if(a<b)
            System.out.println("<");
            else if(a>b)
            System.out.println(">");
            else 
            System.out.println("=");
        }
    }
}