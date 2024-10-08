class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
            else{
                nums[i] = -1;
            }
        }
        return count;
    }
}

//https://leetcode.com/problems/remove-element/
