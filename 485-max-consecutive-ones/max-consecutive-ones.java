class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxx = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                maxx = Math.max(maxx, count);
                count = 0;
            }
        }
        return Math.max(maxx, count);
    }
}