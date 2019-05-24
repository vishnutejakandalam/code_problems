import java.util.Scanner;
class reciept
{
    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int p;
            p=s.nextInt();
            int temp=0;
            for(int j=11;j>=0;j--)
            {
                temp=temp+p/(int)Math.pow(2,j);
                p=p%(int)Math.pow(2,j);
            }
            System.out.println(temp);
        }
    }
}