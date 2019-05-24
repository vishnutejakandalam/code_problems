class Solution:
    def Met(n):
        fno=0;
        sno=1;
        while(n>0):
            print(fno,end=" ");
            sum=fno+sno;
            fno=sno;
            sno=sum;
            n-=1;
        print();
if __name__ == "__main__":
    Solution.Met(0);
    Solution.Met(1);
    Solution.Met(5);
    Solution.Met(8);
            
