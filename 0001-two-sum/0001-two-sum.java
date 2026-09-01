class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Arrays.sort(nums);
        // int l = 0;
        // int r = nums.length - 1;

        // while(l < r) {
        //     int sum = nums[l] + nums[r];
        //     if(sum == target) {
        //         return new int[]{l, r};
        //     }
        //     else if(sum < target) {
        //         l++;
        //     }
        //     else {
        //         r--;
        //     }
        // }
        // return new int[]{};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];

            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}