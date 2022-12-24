class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=-1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max;
        int high=sum;

        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isweightPossible(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean isweightPossible(int[] arr,int m,int day){
        int d=1;
        int sum=0;

        for(int i:arr){
            sum+=i;
            if(sum>m){
                d++;
                sum=i;
            }
        }
        return d<=day;
        
    }
}
