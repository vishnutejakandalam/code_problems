import java.util.Scanner;
class balloon 
{
    public static void main(String[] args) {
        int te;
        Scanner s=new Scanner(System.in);
        Scanner se=new Scanner(System.in);
        te=s.nextInt();
        for(int t=1;t<=te;t++)
        {
            int a=0;
            int b=0;
            String ba=new String();
            ba=se.nextLine();
            for(int i=0;i<ba.length();i++)
            {
                if(ba.charAt(i)=='a')
                a++;
                else if(ba.charAt(i)=='b')
                b++;
            }
            if(a>b)
            System.out.println(b);
            else if(a<b)
            System.out.println(a);
            else if(a==b)
            System.out.println(a);
        }
    }
}