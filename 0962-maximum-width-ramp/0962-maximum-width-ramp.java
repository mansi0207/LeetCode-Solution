class Solution {
    public int maxWidthRamp(int[] nums) {
        // code here
        
        // int max = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(i<j && nums[i] <= nums[j]){
        //             max = Math.max(max, j-i);
        //         }
        //     }
        // }
        // return max;

        int n = nums.length;
        int[][] arr = new int[n][2]; 

         for(int i=0;i<n;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
         }

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
         int min = n;
         int max = 0;

         for(int i=0;i<n;i++){
            min = Math.min(min, arr[i][1]);
            max = Math.max(max, arr[i][1] - min);
         }
         return max;

    }
}