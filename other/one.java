import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int d;
            boolean isw;
            d=s.nextInt();
            isw=s.nextBoolean();
            if(d==1 || d==7)
            {
                if(isw)
                System.out.println("9:00");
                else
                System.out.println("6:00");
            }
            else
            {
                if(isw)
                System.out.println("7:00");
                else
                System.out.println("5:00");
            }
        }
        
    }
}