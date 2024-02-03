class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        for(int i=0;i<nums.length;i++){
            
            
            int right=0;
            for(int j=i+1;j<nums.length;j++){
                right+=nums[j];
            }
            
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}