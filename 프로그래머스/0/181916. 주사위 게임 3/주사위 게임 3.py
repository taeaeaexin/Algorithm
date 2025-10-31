from collections import Counter

def solution(a, b, c, d):
    cnt = list(Counter([a,b,c,d]).items())
    
    if len(cnt) == 1:
        return cnt[0][0] * 1111
    elif len(cnt) == 2:
        if cnt[0][1] == 3 or cnt[1][1] == 3:
            return (10*cnt[0][0]+cnt[1][0])**2 if(cnt[0][1]==3) else (10*cnt[1][0]+cnt[0][0])**2
        else:
            return (cnt[0][0]+cnt[1][0])*(abs(cnt[0][0]-cnt[1][0]))
    elif len(cnt) == 3:
        result = 1
        for i in range(3):
            if cnt[i][1] == 1:
                result *= cnt[i][0]
        return result
    else:
        return min(cnt[0][0], cnt[1][0], cnt[2][0], cnt[3][0])