class Solution {
    public String solution(String myString, String pat) {
        for(int i = myString.length()-pat.length() ; i >= 0 ; i--){
            if(myString.substring(i,myString.length()).startsWith(pat)) return myString.substring(0,i+pat.length());
        }
        return "";
    }
}