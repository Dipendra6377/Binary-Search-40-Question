//1st solution

class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] res=new int[2];
          int first = occurences(nums,target);

          if(first==nums.length || nums[first]!=target){
              return new int[]{-1,-1};
          }

          return new int[]{first,occurences(nums,target+1)-1};
    }
    public static int occurences(int[] arr,int k){
    
        int l=0;
        int h=arr.length;

        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]<k){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
}

// 2nd solution

class Solution {
    public int[] searchRange(int[] a, int t) {
        int n=a.length;
        int ans[]=new int[2];
        int l=0;
        int h=n-1;
        int f1=0,f2=0,f=0;
        if(n>0)
              {
              if(a[0]==t)
              {
                  ans[0]=0;
                  f1=1;
              }
              if(a[n-1]==t)
              {
                  ans[1]=n-1;
                  f2=1;
              }
        
        int mid=0;
              do{
                  if(f1==1)
                  {
                      break;
                  }
                  mid=(l+h)/2;
                  if(a[mid]==t && a[mid-1]!=t)
                  {
                      ans[0]=mid;
                      f=1;
                      break;
                  }
                  else if(a[mid]>=t)
                  {
                      h=mid-1;
                  }
                  else{
                      l=mid+1;
                  }
              }while(l<=h);
        l=0;
        h=n-1;
              do{
                  if(f2==1)
                  {

                      break;

                  }
                  mid=(l+h)/2;
                  if(a[mid]==t && a[mid+1]!=t)
                  {
                      ans[1]=mid;
                      f=1;
                      break;
                  }
                  else if(a[mid]<=t)
                  {
                      l=mid+1;
                  }
                  else{
                      h=mid-1;
                  }
              }while(l<=h);
        }
        else{
            ans[0]=-1;
            ans[1]=-1;
        }
        if(f==0 && f1==0 &&f2==0)
        {
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}
