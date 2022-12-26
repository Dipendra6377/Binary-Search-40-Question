//TIME COMPLEXITY 0(N)

class Complete{
    
  
    int KthMissingElement(int a[], int n, int k)
    {
        // Complete the function
        int count=0;
        int ans=0;
        for(int i=0;i<n-1;i++){
            int diff=a[i+1]-a[i];
            
            if(diff>k){
                return a[i]+k;
            }
            k-=diff-1;
        }
        return -1;
    }
  
    
}


//TIME COMPLEXITY 0(LOGN)


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int j=n;

        while(i<j){
            int mid=i+(j-i)/2;

            if(arr[mid]-(mid+1)>=k){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i+k;
    }
}
