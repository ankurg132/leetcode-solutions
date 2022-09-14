class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        //array should be at index position
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!= arr[i]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        //array now sorted except the wrong arrays
        
        List<Integer> dissNum = new ArrayList<Integer>();
        // int j = 1;
        // while(j<arr.length){
        //     if(j != arr[j-1]){
        //         dissNum.add(j);
        //     }
        //     else {
        //         j++;
        //     }
        // }
        // return dissNum;
        for(int j=1;j<=arr.length;j++){
            if(j!=arr[j-1]){
                dissNum.add(j);
            }
        }
        return dissNum;
    }
}