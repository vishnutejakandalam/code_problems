import java.util.*;
class iop
{
    public static void main(String[] args) {
        int n,k,a;
        int count=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a=s.nextInt();
            if(a%k==0)
            count++;
        }
        System.out.println(" "+count);
    }
}