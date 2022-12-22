class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int start = occ(arr,n,x);
        
        if(start==n || arr[start]!=x){
            return 0;
        }
        
        int end=occ(arr,n,x+1)-1;
        
        return end-start+1;
    }
    
    int occ(int[] arr,int n,int x){
        int l=0;
        int h=n;
        
        while(l<h){
            int mid=(l+h)/2;
            
            if(arr[mid]<x){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
    
}
