class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int l=0;
        int h=max;

        int ans=-1;

        while(l<=h){
            int mid=l+(h-l)/2;

            int smallestdiv = findtotaldiv(nums,mid);

            if(smallestdiv<=threshold){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }

    public int findtotaldiv(int[] arr,int m){
        int total=0;

        for(int i:arr){
            total+=Math.ceil(i*1.0/m);
        }
        return total;
    }
}
