class Solution {
    public int countKeyChanges(String s) {
        String dhruv = s.toLowerCase();
        int ans = 0;
        int len = s.length();
        for(int i = 0;i<len-1;i++){
            if(dhruv.charAt(i) != dhruv.charAt(i+1)){
                ans += 1;
            }
        }
        System.out.println(dhruv);
        return ans;
    }
}