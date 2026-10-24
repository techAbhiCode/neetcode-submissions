class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n-k+1];
        int ri = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i =0; i<n; i++){

            if(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offer(i);


            if(i >= k-1){
                result[ri++] = nums[dq.peek()];
            }
        }
        return result;
    }
}
