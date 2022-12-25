class Solution {
    public static int solve(int n, int k, int[] stalls) {
        int i=1;
        int j=1000000000;
        int ans=-1;
        Arrays.sort(stalls);
        
        while(i<=j){
            int mid=(i+j)/2;
            int cow=1;
            int prev=stalls[0];
            
            for(int l=1;l<n;l++){
                if(stalls[l]-prev>=mid){
                    cow++;
                    prev=stalls[l];
                    if(k==cow){
                        break;
                    }
                }
            }
            if(cow==k){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
}
