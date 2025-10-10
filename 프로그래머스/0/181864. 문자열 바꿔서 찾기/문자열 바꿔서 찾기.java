class Solution {
    public int solution(String myString, String pat) {
        pat = pat.replace("A", "C");
        pat = pat.replace("B", "A");
        pat = pat.replace("C", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}