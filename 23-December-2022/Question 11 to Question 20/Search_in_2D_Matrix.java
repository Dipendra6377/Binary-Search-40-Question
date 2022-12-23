class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        int l=0;
        int h=(n*m)-1;

        while(l<=h){
            int mid=(l+h)/2;

            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            else if(matrix[mid/m][mid%m]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}
