class Solution:
    def Met(self,n):
        li=(2,2,3,5,7,11,13,17,19,23);
        s=str(n);
        for i in range(0,len(s)):
            print('x'*li[int(s[i])],s[i],sep="");

if __name__ == "__main__":
    Solution.Met(Solution,3);
    Solution.Met(Solution,6);