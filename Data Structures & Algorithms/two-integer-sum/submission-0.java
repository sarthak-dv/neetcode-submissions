class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];
            if(maps.containsKey(diff))
            return new int[]{maps.get(diff), i};
            maps.put(nums[i], i);
        }
        return new int[]{};
    }
}
