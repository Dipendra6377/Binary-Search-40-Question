class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
        }

        int i=max;
        int j=sum;
        int ans=-1;
        if(k==nums.length){
            return max;
        }

        while(i<=j){
            int mid=i+(j-i)/2;

            int minsum =findminsum(nums,mid);

            if(minsum<=k){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }

    public int findminsum(int[] arr,int m){
        int s=0;
        int key=1;

        for(int i=0;i<arr.length;i++){
            s+=arr[i];

            if(s>m){
                key++;
                s=arr[i];
            }
        }
        return key;
    }
}
