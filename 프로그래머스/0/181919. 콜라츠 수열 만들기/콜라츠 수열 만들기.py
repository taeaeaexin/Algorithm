def solution(n):
    answer = []
    while n != 1:
        answer.append(n)
        n = n/2 if n%2==0 else 3*n+1
    answer.append(1)
    return answer