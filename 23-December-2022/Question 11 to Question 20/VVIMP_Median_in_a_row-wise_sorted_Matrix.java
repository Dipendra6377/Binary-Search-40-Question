class Solution {
    int median(int matrix[][], int R, int C) {
        // code here
        int i=0;
        int j=2000;
        int n=R*C;
        int midval;
        
        while(i<=j){
            midval=(i+j)/2;
            
            int ans=0;
            
            for(int k=0;k<R;k++){
                int l=0;int h=C-1;
                
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(matrix[k][mid]<=midval) l=mid+1;
                    else h=mid-1;
                }
                ans+=l;
            }
            if(ans<=n/2) i=midval+1;
            else j=midval-1;
        }
        return i;
    }
}
