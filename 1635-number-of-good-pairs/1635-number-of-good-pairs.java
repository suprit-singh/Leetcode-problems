class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ct=0;
        for(int i=0; i<nums.length-1; i++){
            for(int k=i+1; k<nums.length; k++){
                if(nums[i]==nums[k]){
                    ct++;
                }
            }
        }
        return ct;
    }
}