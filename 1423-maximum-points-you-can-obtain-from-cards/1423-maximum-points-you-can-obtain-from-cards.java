class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int minsum = 0;
        int n = cardPoints.length;
        int total = 0;

        for(int i = 0; i<n;i++){
            total += cardPoints[i];
            
        }
        if(n==k){
            return total;
        }
        int windowSize = n - k;
        int windowSum = 0;

        for(int j = 0;j<windowSize;j++){
            windowSum += cardPoints[j];
        }
        minsum = windowSum;

        for(int a = windowSize;a<n;a++){
            windowSum += cardPoints[a];
            windowSum -= cardPoints[a-windowSize];

            minsum = Math.min(minsum,windowSum);
        }

        return total - minsum;       
        
    }
}