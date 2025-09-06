class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] n : queries){
            String left = my_string.substring(0,n[0]);
            String mid = "";
            for(int i = n[1] ; i >= n[0] ;i--){
                mid += my_string.charAt(i);
            }
            String right = my_string.substring(n[1]+1);
            
            my_string = left + mid + right;
        }
        return my_string;
    }
}