class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndexMap = new HashMap<>();

    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

        int num = nums[i];
        int complement = target - num;
        Integer complementIndex = numToIndex.get(complement);

        if (complementIndex != null) {
            return new int[]{complementIndex, i};
        }
        numToIndex.put(num, i);
    }
    return new int[]{};
    }
}
