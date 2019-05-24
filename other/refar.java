class Solution
{
    public static void Met(int[] arr) {
        int[] rev=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++)
        rev[i]=arr[n-i-1];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int a=i,b=j,s=0;
                while ((arr[i]==rev[j]) && i<n && j<n) {
                    i++;
                    j++;
                    s++;
                    if(i>=n || j>=n) break;
                }
                i=a;j=b;
                if(s>sum) sum=s;
            }
        }
       System.out.print(sum);
    }
    public static void main(String[] args) {
        int[] a={1,2,1,4};
        Met(a);
    }
}