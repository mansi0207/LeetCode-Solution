class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length;

        Integer[] index = new Integer[n];

        // Store indices
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Sort indices based on nums values
        Arrays.sort(index, (a, b) -> nums[a] - nums[b]);

        int left = n;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            left = Math.min(left, index[i]);

            ans = Math.max(ans, index[i] - left);
        }

        return ans;
    }
}