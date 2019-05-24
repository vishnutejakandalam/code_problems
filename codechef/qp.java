import java.util.Scanner;

class pq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int k=0;k<t;k++)
		{
			int p=in.nextInt();
			int q=in.nextInt();
			if(p>1000)
			{
				System.out.printf("%.6f",p*q*0.900000);
				System.out.println("");
			}
			else
			{
			System.out.printf("%.6f",p*q*1.000000);
			System.out.println("");
			}
		}
    }
}