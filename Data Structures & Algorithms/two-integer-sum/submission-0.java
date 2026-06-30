class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: number -> its index
        // Used for O(1) lookup of the complement
        Map<Integer, Integer> vals = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // If we've seen the complement before, we found the pair
            if (vals.containsKey(complement)) {
                // Return indices: [index of complement, current index]
                return new int[] {vals.get(complement), i};
            }

            // Store current number and its index for future lookups
            vals.put(currentNum, i);
        }

        // Per LeetCode constraints, a solution always exists
        // But we need a return for compilation
        return new int[] {-1, -1};
    }
}
