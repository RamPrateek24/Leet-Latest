class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(var it: nums){
            map.put(it, map.getOrDefault(it, 0) + 1);
        }
        int maxx = 0, ele = -1;
        for(var entry:map.entrySet()){
            if(entry.getValue() > maxx){
                maxx = entry.getValue();
                ele = entry.getKey();
            }
        }
        return ele;
    }
}