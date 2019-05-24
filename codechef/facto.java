import java.util.*;
class facto
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int z=0;
        s=sc.nextInt();
        int c=5;
        while((s/c)>0)
        {
            z=z+(s/c);
            c=c*5;
        }
        System.out.println(z);
    }
    }
}