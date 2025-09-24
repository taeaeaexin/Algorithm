class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        while(!((a%2==1 && b==a+1) || (b%2==1 && a==b+1))) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            answer++;
        }

        return answer;
    }
}