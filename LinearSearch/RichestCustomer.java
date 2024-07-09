class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] integer:accounts){
            int sum = 0;
            for(int ints : integer){
                sum += ints;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
