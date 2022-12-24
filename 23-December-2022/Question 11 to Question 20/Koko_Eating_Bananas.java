class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=0;
        int j=1000000000;
        int minbanana =-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(EatingBananalessthanhr(piles,h,mid)==true){
                minbanana=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return minbanana;
    }
    public boolean EatingBananalessthanhr(int[] piles,int hour,int reqhour){
        int total=0;
        for(int p:piles){
            total+=Math.ceil(p*1.0/reqhour);
        }
        return total<=hour;
    }
}
