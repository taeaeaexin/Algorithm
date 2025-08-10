class Solution {
    public int solution(int a, int b) {
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        return (Integer.parseInt(A+B) > Integer.parseInt(B+A))
            ? Integer.parseInt(A+B)
            : Integer.parseInt(B+A);
    }
}