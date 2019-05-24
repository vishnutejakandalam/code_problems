class Solution
{
    public static int[] Met(int n){
        int f=-1;
        int[] ar=new int[(n*(n+1))/2];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            ar[++f]=j;
        }
        return ar;
    }
}