class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int left = 0;
        int maxi = 0;

        for(int right = 0; right < nums2.length; right++){
            if(left < nums1.length && left <= right && nums1[left] <= nums2[right]){
                maxi = Math.max(maxi, right - left);
            }else if(left < nums1.length && left <= right){
                left++;
                right--;
            }
        }
        return maxi;
    }
}