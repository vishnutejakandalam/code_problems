import java.util.Scanner;
import java.util.*;
class fandl
{
    public static void main(String[] args) {
        int t;
        int n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        if(t<=1000){
        for(int i=0;i<t;i++){
        n=s.nextInt();
        String sc=new String();
        sc=Integer.toString(n);
        char p,q;
        p=(char)sc.charAt(0);
        q=(char)sc.charAt(sc.length()-1);
        System.out.println(Character.getNumericValue(p)+Character.getNumericValue(q));
    }
}
    }
}