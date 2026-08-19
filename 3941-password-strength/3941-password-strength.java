class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();

        int sum = 0;

        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);

            if(set.add(ch)){
                if(ch >= 'a' && ch <= 'z'){
                    sum += 1;
                }else if(ch >= 'A' && ch <= 'Z'){
                    sum += 2;
                }else if(ch >= '0' && ch <= '9'){
                    sum += 3;
                }else{
                    sum += 5;
                }
            }
        }
        return sum;
    }
}