/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Most Easiest solution
        // for(int i=1;i<=n;i++){
        //     if(isBadVersion(i)){
        //         System.out.println(i);
        //         return i;
        //     }
        // }
        
        //Binary Search
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(isBadVersion(start)){
            return start;
        }
        return -1;
    }
}