import java.util.Scanner;

  class pallen
{
    public static void main(String args[])
    {
        int j;
        int t;
        int n,rno,no;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
        no=s.nextInt();
        n=no;
        rno=0;
        while(n>0)
        {
            j=n%10;
            rno=rno*10+j;
            n=n/10;
        }
        System.out.print(rno+"\n");
    }
}
}