class Solution {
    public int solution(int a, int b, int c) {
        return a != b && b != c && c != a
            ? (int)(a + b + c)
            : a == b && b ==c
            ? (int)((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))
            * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)))
            : (int)((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
    }
}