
class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int l=0;
        int h=m;
        
        while(l<=h){
            int mid=(l+h)/2;
            int sq=(int)Math.pow(mid,n);
            
            if(sq==m){
                return mid;
            }
            
            else if(sq>m){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
