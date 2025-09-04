class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a==b && b==c && c==d) return 1111*a;
        if(a==b && b==c && c!=d) return (int)Math.pow(10*c+d,2);
        if(a==b && b==d && d!=c) return (int)Math.pow(10*d+c,2);
        if(a==c && c==d && d!=b) return (int)Math.pow(10*d+b,2);
        if(b==c && c==d && d!=a) return (int)Math.pow(10*b+a,2);
        if(a==b && c==d && a!=c) return (a+c)*Math.abs(a-c);
        if(a==c && b==d && a!=b) return (a+b)*Math.abs(a-b);
        if(a==d && b==c && a!=b) return (a+b)*Math.abs(a-b);
        if(a==b && c!=d) return c*d;
        if(a==c && b!=d) return b*d;
        if(a==d && b!=c) return b*c;
        if(b==c && a!=d) return a*d;
        if(b==d && a!=c) return a*c;
        if(c==d && a!=b) return a*b;
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}