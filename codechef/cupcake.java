import java.util.Scanner;
class cupcake
{
    public static void main(String[] args) {
        int t;
        int n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            n=s.nextInt();
            System.out.println((n/2)+1);
        }
    }
}