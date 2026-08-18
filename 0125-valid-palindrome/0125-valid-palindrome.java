class Solution {
    public boolean isPalindrome(String s) {
        // int i = 0;
        // int j = s.length() - 1;
        // while(i<=j){
        //     // if(!Character.isLetterOrDigit(s.charAt(i))){
        //     //     i++;
        //     // }else if (!Character.isLetterOrDigit(s.charAt(j))){
        //     //     j--;
        //     // }else{
        //     //     if(Character.toLowerCase((char)s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
        //     //         return false;
        //     //     }
        //     //     i++;
        //     //     j--;
        //     // }
        //     char left = s.charAt(i);
        //     char right = s.charAt(j);

        //     if(!((left>='A' && left<='Z') || (left>='a' && left<='z') || left>='0' && left<='9')){
        //         i++;
        //     }else if(!((right>='A' && right<='Z') || (right>='a' && right<='z') || right>='0' && right<='9')){
        //         j--;
        //     }else{
        //         if (left >= 'A' && left <= 'Z') {
        //             left = (char)(left + ('a' - 'A'));
        //         }

        //         if (right >= 'A' && right <= 'Z') {
        //             right = (char)(right + ('a' - 'A'));
        //         }

        //         if (left != right) {
        //             return false;
        //         }

        //         i++;
        //         j--;
        //     }

        // }
        // return true;

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int left = 0;

        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}