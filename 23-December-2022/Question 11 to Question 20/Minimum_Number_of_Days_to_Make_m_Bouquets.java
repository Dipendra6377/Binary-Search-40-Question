class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }

        int max=-1;
        for(int i:bloomDay){
            max=Math.max(max,i);
        }
        int l=1;
        int h=max;
        int ans=-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            int totalboq = findtotalboquete(bloomDay,mid,k);

            if(totalboq>=m){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int findtotalboquete(int[] arr,int mid,int k){
        int count =0;
        int result=0;
        for(int i:arr){
            if(mid>=i){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                result++;
                count=0;
            }
        }
        return result;
    }
}
