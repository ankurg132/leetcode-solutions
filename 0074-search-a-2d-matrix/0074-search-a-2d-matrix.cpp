class Solution {
public:
    int searchRow(vector<vector<int>>& matrix, int target){
        int start = 0;
        int end = matrix.size() - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].size()-1] >= target){
                return mid;
            }
            if(matrix[mid][0] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    bool searchTarget(vector<int>& arr, int target){
        int start = 0;
        int end = arr.size()-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int res = searchRow(matrix, target);
        cout<<res;
        if(res!=-1){
            return searchTarget(matrix[res], target);
        }
        return false;
    }
};