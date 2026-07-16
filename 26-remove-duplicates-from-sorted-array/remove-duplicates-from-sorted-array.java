class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0], n = nums.length, count = 1, index = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == prev) continue;
            else{
                count++;
                prev = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return count;
    }
}