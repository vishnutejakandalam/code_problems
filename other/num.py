class Solution:
    def Met(self,n):
        sum=0;
        for i in range(0,n+1):
            sum=sum+i;
        for row in range(1,n+1):
            temp=sum;
            for i in range(1,n-(n-row)+1):
                if temp <10:
                    if row == i:
                        print("0",temp,end="",sep="");
                    else:
                        print("0",temp,".",end="",sep="");
                        temp-=(n-i);  
                else:  
                    if row == i:
                        print(temp,end="");
                    else:
                        print(temp,".",end="",sep="");
                        temp-=(n-i);   
            sum-=1; 
            print();

if __name__ == "__main__":
   # Solution.Met(1);
   # Solution.Met(4);
    Solution.Met(Solution,7);