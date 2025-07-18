class Solution {
    public int rob(int[] nums) {
        //pick and not pick
        int m = nums.length;
        // filling the dp array with -1
        int[] dp = new int[m];
        Arrays.fill(dp,-1);
        return helper(dp,nums,m-1);

    }
    private int helper(int[]dp,int[]nums,int n){
        // u will reach to 0 only if u chose 2 then that means u will pick 0 now so add it in 
        if(n==0)return nums[0];

        if(n<0) return 0; // if u chose 1 then 1-2 will give -1 for that it will return 0
        if(dp[n]!=-1) return dp[n];
        
        // u wanna pick the number sopick it add it and then the next u will chose is n-2 so recurse
        int pick = nums[n] + helper(dp,nums,n-2);

        // if u dont pick tjis number  so skip it hence zero and if u dont pick this then u canpick adjacent one hence -1
        int notpick = 0 + helper(dp,nums,n-1);

        dp[n]= Math.max(pick,notpick);
        // will tak max of if chosing it giving best answer or not chosing it
        return dp[n];
    }
}
    
   
