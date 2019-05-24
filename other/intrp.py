class Solution:
    def Met(self,n):
        s=str(n);
        for q in range(0,len(s)):
            t=int(s[q])
            i=2;
            m=0;
            while m<t and i>=2:
                c=0;
                for k in range(2,i):
                    if k%2 ==0 and k != 2:
                        break;
                    else:
                        if i%k == 0:
                            c+=1;
                        if c > 1:
                            break;
                if c == 0:
                    m+=1;
                i+=1;
            print((i-1)*'x',t,sep="");

if __name__ == "__main__":
    Solution.Met(Solution,8);
    Solution.Met(Solution,9);
            