class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0,s);
        String mid = "";
        for(int i = e ; i >= s ; i--){
            mid += my_string.charAt(i);
        }
        return start+mid+my_string.substring(e+1);
    }
}