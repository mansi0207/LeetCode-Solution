class Solution {
    boolean ispossible(int[] bloomDay, int m, int k, int mid){
        int flower = 0;
        int bouquet = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                flower++; 

                if(flower == k){
                    bouquet++;
                    flower = 0;
                } 
            }else{
                flower = 0;
            }
        }
        return bouquet >= m;
    }

   public int minDays(int[] bloomDay, int m, int k) {

    if ((long) m * k > bloomDay.length) {
            return -1;
    }

    int left = 0;
    int right = 0;
    int ans = 0;

    for(int i=0;i<bloomDay.length;i++){
        left = Math.min(left, bloomDay[i]);
        right = Math.max(right, bloomDay[i]);
    }

    while(left <= right){
        int mid = left + (right - left)/2;

        if(ispossible(bloomDay, m, k, mid)){
            right = mid - 1;
            ans = mid;
        }else{
            left = mid + 1;
        }
    }
    return ans;
    }
}