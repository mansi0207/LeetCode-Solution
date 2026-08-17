class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        int ans = 0;

        for(int i=0;i<quantities.length;i++){
            right = Math.max(right, quantities[i]);
        }

        while(left <= right){
            int mid = left + (right - left)/2;

            int store = 0;
            for(int i=0;i<quantities.length;i++){
                store += (quantities[i] + mid - 1)/mid;
            }

            if(store <= n){
                right = mid - 1;
                ans = mid;
            }else {
                left = mid + 1;
            }


        }
        return ans;
    }
}