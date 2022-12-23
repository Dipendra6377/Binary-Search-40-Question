class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        if(n==1){
            return nums[0];
        }

        while(i<n){
            int next=(i+1)%n;
            if(nums[i]==nums[next]){
                i=i+2;
            }
            else{
                return nums[i];
            }
        }
        return-1;
    }
}
