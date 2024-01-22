class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            if (res.containsKey(target - nums[i])) {
                return new int[]{i, res.get(target - nums[i])};
            }
            res.put(nums[i], i);
        }
        return null;
    }
}