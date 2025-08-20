class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return n == m && eq.equals("=") ? 1 
            : n < m && ineq.equals("<") ? 1
            : n > m && ineq.equals(">") ? 1
            : 0;
    }
}