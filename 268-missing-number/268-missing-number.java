class Solution {
    static void swap(int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }
    public int missingNumber(int[] arr) {
        int i = 0;
        //array should be at index position
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]!=arr.length && arr[correct]!= arr[i]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        //array now sorted
        int j = 0;
        while(j<arr.length){
            if(j != arr[j]){
                return j;
            }
            else {
                j++;
            }
        }
        return arr.length;
    }
}