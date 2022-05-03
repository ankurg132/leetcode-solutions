class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        // we find 2 elements closest in arr2 to the choosen element in arr1
        for(int i=0;i<arr1.length;i++){
            int index = Arrays.binarySearch(arr2, 0, arr2.length, arr1[i]);
            //if index is not found, the function returns the negative position where the element can be inserted, the next line converts this into positive index
            if(index<0){
             index = -(index+1);   
            }
            boolean isShort = false;
            if(index < arr2.length && Math.abs(arr2[index]-arr1[i])<=d){
                isShort = true;
            }
            else if(index != 0 && Math.abs(arr2[index-1] - arr1[i]) <= d){
                isShort = true;
            }
            if(!isShort){
                ans++;
            }
            
        }
        return ans;
    }
}