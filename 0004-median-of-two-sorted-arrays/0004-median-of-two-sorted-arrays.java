class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }

        n = nums1.length;
        m = nums2.length;

        int leftArraySize = (n + m + 1) / 2;

        int left = 0;
        int right = n;

        while (left <= right) {

            int mid1 = left + (right - left) / 2;
            int mid2 = leftArraySize - mid1;

            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n) ? nums1[mid1] : Integer.MAX_VALUE;

            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r2 = (mid2 < m) ? nums2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
                else {
                    return Math.max(l1, l2);
                }
            }
            else if (l1 > r2) {
                right = mid1 - 1;
            }
            else {
                left = mid1 + 1;
            }
        }
        return 0.0;
    }
}