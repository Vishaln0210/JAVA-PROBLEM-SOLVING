class Solution {
    public int search(int[] nums, int target){
        int pivot = findpivot(nums);
        if(pivot == -1){
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        else{
            int ans = binarysearch(nums, target, 0, pivot - 1);
            if(ans == -1){
                ans = binarysearch(nums, target, pivot + 1, nums.length - 1);
            }
            return ans;
        }
    }
    public int findpivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
               return mid;
            }
            else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] < nums[start]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int binarysearch(int[] nums, int target, int start, int end){ 
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
