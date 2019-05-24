class Solution
{
    public static void Met(int n) {
        int[] pre={1,0};
        for(int i=1;i<=n;i++)
        {
            int[] ne=new int[i+2];
            ne[0]=1;
            ne[i]=0;
              for(int k=0;k<=pre.length-3 ;k++)
                    {
                        ne[k+1]=pre[k]+pre[k+1];
                    }            
            for (int g=0;g<ne.length-2;g++) 
            System.out.print(ne[g]+" ");
            System.out.println();    
            pre=new int[ne.length];
            for(int g=0;g<pre.length;g++)
            pre[g]=ne[g];
        }
    }
    public static void main(String[] args) {
            Met(7);
    }
}