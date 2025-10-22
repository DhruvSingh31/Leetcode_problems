class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int rem;
        int num3 = num;
        while(num3 >0){
            rem = num3%10;
            if(num%rem == 0){
                ans+=1;
            }
            num3 = num3/10;
        }
        System.out.println("The output is "+ans);
        return ans;
    }
}
