class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int l=0;
        int h=n-1;

        while(l<=h){
            int mid=(l+h)/2;
            int prev = (mid+n-1)%n;
            int next=(mid+1)%n;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                return arr[mid];
            }

            else if(arr[mid]>arr[h]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return arr[0];
    }
}
