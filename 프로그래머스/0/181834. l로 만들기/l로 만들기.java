class Solution {
    public String solution(String myString) {
        for(int i = 'a'-0 ; i < 'l'-0 ; i++) myString = myString.replace((char)(i), 'l');
        return myString;
    }
}