import java.util.Scanner;

class four
{
    public static void main(String[] args) {
        int n,t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            n=s.nextInt();
            String sc=new String();
            sc=Integer.toString(n);
            for(int j=0;j<sc.length();j++)
            {
                if(Character.getNumericValue(sc.charAt(j))==4)
                count++;
            }
            System.out.println(count);
        }
    }
}