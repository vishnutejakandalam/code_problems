class Solution:
    def Met(self,arr):
        f=False;
        for i in range(0,len(arr)):
            sum1=sum2=0;
            for j in range(0,i+1):
                sum1=sum1+arr[j];
            for k in range(j+1,len(arr)):
                sum2=sum2+arr[k];
            if sum1 == sum2:
                f=False;
                print("true");
                break;
            else:
                f=True;
                continue;
        if f==True:
            print("false");
                

if __name__ == "__main__":
    Solution.Met(Solution,(1,1,2,0));
    Solution.Met(Solution,(1,1,0,5,1));