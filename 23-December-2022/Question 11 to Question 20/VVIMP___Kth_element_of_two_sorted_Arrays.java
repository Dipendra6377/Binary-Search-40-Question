
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n>m){
            //return kthElement(arr2,arr1,m,n,k);
        }
        
        int l=Math.max(0,k-m);
        int h=Math.min(k,n);
        
        while(l<=h){
            int mid1=(l+h)>>1;
            int mid2=k-mid1;
            int l1 = mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1]; 
            int l2=mid2==0?Integer.MIN_VALUE:arr2[mid2-1];
            int r1=mid1==n?Integer.MAX_VALUE:arr1[mid1];
            int r2=mid2==m?Integer.MAX_VALUE:arr2[mid2];
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                h=mid1-1;
            }
            else{
                l=mid1+1;
            }
        }
        return 1;
         
    }
}
