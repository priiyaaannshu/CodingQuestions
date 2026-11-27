class Solution {
    public int lastStoneWeightII(int[] stones) {
        int total = 0;
        for(int i = 0; i<stones.length;i++){
            
             total += stones[i];             
        }
        int target = total/2;

        boolean []dp = new boolean[target+1];
        dp[0] = true;

        for(int i =0;i<stones.length;i++){
            int stone = stones[i];

            for(int j = target; j>=stone;j--){
                dp[j] = dp[j] || dp[j-stone];

            }
        }

        for(int i = target; i>=0;i--){
            if(dp[i]){
                return total-2*i;

            }
   
            


        }
        return 0;

        
        
    }
}