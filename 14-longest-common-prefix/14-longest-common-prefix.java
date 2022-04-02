class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int leng = strs.length;
        for(int i=1;i<leng;i++){
            String str = strs[i];
            int k = 0;
            while(k<Math.min(str.length(),prefix.length())){
                if(str.charAt(k)!=prefix.charAt(k)){
                    break;
                }
                k++;
            }
            prefix = prefix.substring(0,k);
            System.out.println(k);
        }
        System.out.println(prefix);
        return prefix;
    }
}