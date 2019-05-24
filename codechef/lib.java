import java.util.Scanner;
class lib
{
    public static void main(String[] args) {
        int ns,nr;
        int[] cb;
        Scanner s=new Scanner(System.in);
        ns=s.nextInt();
        nr=s.nextInt();
        int[][] cp=new int[ns][nr];
        cb=new int[ns];
        while(nr>0)
        {
            int type;
            type=s.nextInt();
            if(type==1)
            {
                int co=0;
                int x,y;
                x=s.nextInt();
                y=s.nextInt();
                cb[x]++;
                cp[x][co]=cp[x][co]+y;
                co++;
            }
            else if(type==2)
            {
                int x,y;
                x=s.nextInt();
                y=s.nextInt();
                System.out.println(cp[x][y]);
            }
            else if(type==3)
            {
                int x;
                x=s.nextInt();
                System.out.println(cb[x]);
            }
        nr--;
        }
    }
}