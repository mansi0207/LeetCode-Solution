class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int sum = 0, maxi = Integer.MIN_VALUE;

        for(int right=0;right < nums.length; right++){
            sum += nums[right];
            if(right - left + 1 == k){
                maxi = Math.max(maxi, sum);
                sum -= nums[left];
                left++;
            }
        }
        return (double) maxi / k;
    }
}