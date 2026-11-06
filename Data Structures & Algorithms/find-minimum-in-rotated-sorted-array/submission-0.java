class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the rightmost element,
            // the minimum must be in the right half.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // If mid element is less than or equal to the rightmost element,
            // the minimum is either at mid or to the left of it.
            else {
                right = mid;
            }
        }
        
        // When left == right, it points to the minimum element.
        return nums[left];
    }
}
