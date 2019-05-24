import java.util.Scanner;

class notes
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,t;
        int[] not;
                t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int sum=0;
            not=new int[6];
            n=s.nextInt();
            for(int f=0;f<6;f++)
            not[f]=0;
            while(n!=0)
            {
                not[0]=not[0]+(n/100);
                n=n%100;
                not[1]=not[1]+(n/50);
                n=n%50;
                not[2]=not[2]+(n/10);
                n=n%10;
                not[3]=not[3]+(n/5);
                n=n%5;
                not[4]=not[4]+(n/2);
                n=n%2;
                not[5]=not[5]+(n/1);
                n=n%1;
            }
            for(int j=0;j<6;j++)
            sum=sum+not[j];
            System.out.println(sum);
        }
    }
}