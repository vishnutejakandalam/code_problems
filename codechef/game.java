import java.util.Scanner;
class game
 {
     public static void main(String[] args) {
         int n;
         int[] a=new int[21],b=new int[21];
         int w1=0,w2=0;
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
         for(int i=0;i<n;i++)
         {
            a[i]=s.nextInt();
            b[i]=s.nextInt();
         }
         for(int j=0;j<n;j++)
         {
             w1=w1+a[j];
             w2=w2+b[j];
         }
         if(w1>w2)
         System.out.println(1+" "+(w1-w2));
         else if(w2>w1)
         System.out.println(2+" "+(w2-w1));
     }
    
}