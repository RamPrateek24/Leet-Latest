class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for(var it: nums){
            val ^= it;
        }
        return val;
    }
}