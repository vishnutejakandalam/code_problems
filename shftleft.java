import java.util.Scanner;
class shftleft
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int n=s.nextInt();
        int[] ar=new int[r];
        for(int i=0;i<r;i++)
        ar[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int temp=ar[0];
            for(int j=1;j<=ar.length-1;j++)
            ar[j-1]=ar[j];
            ar[ar.length-1]=temp;
            }
            for(int m=0;m<ar.length;m++)
            {
                System.out.print(" "+ar[m]);
            }
    }
}