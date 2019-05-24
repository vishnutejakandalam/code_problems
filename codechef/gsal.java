import java.util.Scanner;
class gsal
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int c=0;c<t;c++)
        {
            int sal=s.nextInt();
            double gsal;
            if(sal<1500)
            gsal=sal+sal;
            else
            {
                gsal=sal+500;
                double m=0.98*sal;
                gsal=gsal+m;
            }
            
            System.out.println(gsal);
        }
    }
}