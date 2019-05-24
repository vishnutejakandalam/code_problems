import java.util.Scanner;

class sfacto
{
    public static void main(String[] args) {
        int t;
        int n;
        long fa=1;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        if(t<100)
        {
        for(int i=0;i<t;i++)
        {
            fa=1;
            n=s.nextInt();
            for(int j=1;j<=n;j++)
            fa=fa*j;
            System.out.println("\n"+fa);
        }
    }
    }
   }