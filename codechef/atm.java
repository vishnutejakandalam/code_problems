import java.util.*;
class atm
{
    public static void main(String[] args) {
        int amo;
        float bal;
        Scanner sc=new Scanner(System.in);
        amo=sc.nextInt();
        bal=sc.nextFloat();
        if(amo%5==0)
        {
            if(((float)amo+0.5)<bal)
            {
                System.out.println("\n"+(bal-amo-0.5));
            }
            else
            {
                System.out.println(bal);
            }
        }
        else
        System.out.println("\n"+bal);
    }
}