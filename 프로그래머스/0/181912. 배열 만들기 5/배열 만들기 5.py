def solution(intStrs, k, s, l):
    answer = []
    for num in intStrs:
        n = int(num[s:s+l])
        if n > k:
            answer.append(n)
    return answer