import java.io.*;
class Patterns
{
    public static void main(String[] args) {
        int n=10;
        int x = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
                if(i != j) { x++; System.out.print("*"); }
            }
            x++;
            System.out.print("\n");
        }
        x-=n;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
                if(i != j) { x++; System.out.print("*"); }
                if(i == j) x-=j;
            }
            x=x-(i-2);
            System.out.print("\n");
        }
    }
}