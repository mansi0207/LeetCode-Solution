class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
        int i = 0;
        int j = 1;
        int count = 0;

        while(j < nums.length){
            if(i == j){
                j++;
                continue;
            }

            int diff = nums[j] - nums[i];
            if(diff == k){
                count++;

                int l = nums[i];
                int r = nums[j];

                while(i < nums.length && nums[i] == l){
                    i++;
                }

                while(j < nums.length && nums[j] == r){
                    j++;
                }
            }else if(diff < k){
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}