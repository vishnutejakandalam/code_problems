class Solution:
    def Met(n):
        i=2;
        st='1';
        if n == 1:
            print(st);
        else:
            while i<=n:
                st=st+" "+str(i)+" "+st
                i+=1;
            print(st)
if __name__ == "__main__":
    Solution.Met(3);
    print();
    Solution.Met(2);
    print();
    Solution.Met(4);