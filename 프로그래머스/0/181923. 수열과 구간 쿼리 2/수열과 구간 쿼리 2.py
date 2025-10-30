def solution(arr, queries):
    answer = []
    for s,e,k in queries:
        num = 10**9
        for i in range(s,e+1):
            if arr[i] > k:
                num = min(arr[i], num)
                
        answer.append(-1 if num == 10**9 else num)
    return answer