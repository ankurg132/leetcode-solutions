/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);
        int ascSearch = binarySearch(mountainArr, target,0,peak);
        if(ascSearch!=-1){
            return ascSearch;
        }
        else{
            int descSearch = binarySearch(mountainArr, target,peak,mountainArr.length()-1);
            if(descSearch!=-1){
                return descSearch;
            }
            else{
                return -1;
            }
        }
    }

    public static int peakIndex(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }

    static int binarySearch(MountainArray arr,int x, int start, int end )
    {

        // Checking the sorted order of the given array
        boolean isAsc = arr.get(start) < arr.get(end);
        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if x is present at mid
            if (arr.get(middle) == x)
                return middle;

            // Ascending order
            if (isAsc == true) {

                // If x greater, ignore left half
                if (arr.get(middle) < x)
                    start = middle + 1;

                    // If x smaller, ignore right half
                else
                    end = middle - 1;
            }

            // Descending order
            else {

                // If x smaller, ignore left half
                if (arr.get(middle) > x)
                    start = middle + 1;

                    // If x greater, ignore right half
                else
                    end = middle - 1;
            }
        }

        // Element is not present
        return -1;
    }
}