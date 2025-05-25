import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        while(true){
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            if(min%2 == 1 && max == min+1) break;
            
            if(a%2 == 1) a = a/2 + 1;
            else a /= 2;
            
            if(b%2 == 1) b = b/2 + 1;
            else b /= 2;
            
            round++;
        }
        return round;
    }
}