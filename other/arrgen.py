class Solution:
    def Met(self,n):
        for i in range(1,n+1):
            arr=(0);
            for j in range(0,n-i):
                arr.append(0);
            for k in range(i,0,-1):
                arr.append(k);
        return arr;
if __name__ == "__main__":
    arr=Solution.Met(Solution,4);
    print(arr);