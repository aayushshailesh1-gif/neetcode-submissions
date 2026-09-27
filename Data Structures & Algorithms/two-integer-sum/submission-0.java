class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vals = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (vals.containsKey(t)) {
                return new int[]{vals.get(t), i};
            } else {
                vals.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
