class Solution {
public:
    bool isPalindrome(string s) {
        string newString;
        for(int i=0;i<s.length();i++){
            if(isalnum(s[i])){
                s[i] = tolower(s[i]);
                newString += s[i];
            }
        }
        cout<<newString;
        string rev = string(newString.rbegin(), newString.rend());
	    if(rev==newString){
	        return true;
	    }
	    return false;
    }
};