class Solution {
    public int maxOperations(int[] nums, int k) {
        // HashSet<Integer> h=new HashSet();
        int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==k && !h.contains(i) && !h.contains(j)){
        //             h.add(i);
        //             h.add(j);
        //             ans++;
        //         }
        //     }
        // }
        
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                i++;
                j--;
                ans++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
        
        
    }
}