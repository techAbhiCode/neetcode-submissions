class Solution {
    public int trap(int[] height) {
        int left = 0,
            right = height.length-1,
            total = 0,
            leftMax = height[left],
            rightMax = height[right];

        while(left < right){
            if(height[left] < height[right]){
                leftMax = Math.max(leftMax, height[left]);
                if(leftMax - height[left] > 0){
                    total += leftMax - height[left];
                }
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                if(rightMax - height[right] > 0){
                    total += rightMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}
