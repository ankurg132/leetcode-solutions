class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String cleaned = sb.toString();
        String reverse = sb.reverse().toString();
        // System.out.println(reverse);
        if(reverse.equals(cleaned)){
            return true;
        }
        return false;
    }
}