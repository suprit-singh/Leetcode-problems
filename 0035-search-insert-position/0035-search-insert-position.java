class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target){
                k=i;
            }
            if(target>nums[i]){
                k=i+1;
            }
            
        }
        return k;
    }
}