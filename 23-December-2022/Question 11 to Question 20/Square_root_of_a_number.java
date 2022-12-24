class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long i=0;
		long j=x;
		long ans=-1;
		
		while(i<=j){
		    long mid=(i+j)/2;
		    long sq=mid*mid;
		    
		    if(sq==x){
		        return mid;
		    }
		    else if(sq>x){
		        j=mid-1;
		    }
		    else{
		        ans=mid;
		        i=mid+1;
		    }
		
	    }
	    return ans;
    }
}
