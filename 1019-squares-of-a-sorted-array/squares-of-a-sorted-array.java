class Solution {
    public int[] sortedSquares(int[] nums) {
       int n =nums.length;
       int[] res=new int[n];
       int l =0;
       int r = n-1;
       int pos= n-1;
       while(l<=r){
        int lefsq=nums[l]*nums[l];
        int refsq=nums[r]*nums[r];
        if(lefsq>refsq){
            res[pos]=lefsq;
            l++;
            pos--;

        }
        else {
            res[pos]=refsq;
            r--;
            pos--;
            
        }
       } return res;
    }
}