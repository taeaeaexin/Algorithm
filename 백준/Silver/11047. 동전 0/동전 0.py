import sys
input = sys.stdin.readline

N, K = map(int, input().split(' '))
money = []

for i in range(N):
    money.append(int(input().strip()))

answer, n = 0 , N-1
while K > 0:
    if money[n] <= K:
        answer += K//money[n]
        K %= money[n]
        n -= 1
    else:
        n -= 1

print(answer)