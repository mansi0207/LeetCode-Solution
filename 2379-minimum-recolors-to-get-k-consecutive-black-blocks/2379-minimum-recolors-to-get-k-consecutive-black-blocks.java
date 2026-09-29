class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int count = 0;
        int mini = Integer.MAX_VALUE;

        for(int right=0;right<blocks.length();right++){
            if(blocks.charAt(right) == 'W'){
                count++;
            }

            if(right - left + 1 == k){
                mini = Math.min(mini, count);

                if(blocks.charAt(left) == 'W'){
                    count--;
                }
                left++;
            }
        }
        return mini;
    }
}