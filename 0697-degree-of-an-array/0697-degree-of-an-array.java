class Solution {
    public int findShortestSubArray(int[] nums) {

        int[] count = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];

        for (int i = 0; i < 50000; i++) {
            first[i] = -1;
        }

        int degree = 0;
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            count[num]++;

            if (first[num] == -1) {
                first[num] = i;
            }

            last[num] = i;
            degree = Math.max(degree, count[num]);
        }

        int answer = nums.length;

        for (int num = 0; num < 50000; num++) {

            if (count[num] == degree) {
                int length = last[num] - first[num] + 1;
                answer = Math.min(answer, length);
            }
        }
        return answer;
    }
}