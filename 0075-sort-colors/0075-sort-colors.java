class Solution {
    public void sortColors(int[] nums) {
       int temp = 0;
       int left = 0;
       int mid = 0;
       int right = nums.length-1;
       while(mid<=right){
         if(nums[mid]==0){
            temp = nums[left];
            nums[left] = nums[mid];
            nums[mid] = temp;
            left++;
            mid++;
         }
         else if(nums[mid]==1){
            mid++;
         }

         else{
            temp = nums[mid];
            nums[mid] = nums[right];
            nums[right] = temp;
            right--;
         }
        } 
       
    }     
}