import java.util.Scanner;
class rect
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if(a==b)
            {
                if(c==d)
                System.out.println("YES");//if(a==bc==d)
                else//else if(a==cb==d)
                //if(a==db==c)
                System.out.println("NO");
            }
            else if(a==c)
            {
                if(b==d)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
            else if(a==d)
                {
                    if(b==c)
                    {
                        System.out.println("YES");
                    }
                    else
                    System.out.println("NO");
                }
                else 
                System.out.println("NO");
            }
        }
    }
