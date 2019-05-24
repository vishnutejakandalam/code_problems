import java.util.Scanner;

class rev
{
    public static void main(String[] args) {
        int t;
        int n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
           n=s.nextInt();
            String m=new String();
            m=Integer.toString(n);
            int[] r=new int[m.length()];
            for(int f=0,j=(m.length()-1);f<m.length();f++,j--)
            {
                r[f]=Character.getNumericValue(m.charAt(j));
            }
            for(int q=0;q<m.length();q++)
            System.out.print(r[q]);
        }
    }
}
