class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
        int result =0;
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right ){
            int count = nums[right] - nums[left];
            result += count;
        left++;
            right--;
        }
        return result;
               
        
    }
}