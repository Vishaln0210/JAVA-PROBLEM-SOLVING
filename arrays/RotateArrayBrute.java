class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        // Step 1: Copy the last k elements to a temporary array
        int[] temp = new int[k];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            temp[j] = nums[i];
            j++;
        }
        
        // Step 2: Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        
        // Step 3: Copy the temporary array elements back to the original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
