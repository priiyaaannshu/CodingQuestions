import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int i = 0 ; i<nums.length;i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i],table.get(nums[i])+1);

            }else table.put(nums[i],1);
        }

            List<Integer> ans = new ArrayList<>();

            ArrayList<Integer> keys = new ArrayList<>(table.keySet());
            for(int i = 0; i<keys.size();i++){
                int key = keys.get(i);

                if(table.get(key)>nums.length/3){
                    ans.add(key);
                }
            }
            return ans;
        
    }
}