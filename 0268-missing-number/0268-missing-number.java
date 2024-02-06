class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        for(int i = 0 ; i <= nums.length ; i++){
            if(!s.contains(i))
                return i ;
            
        }
        return nums.length;
    }
}