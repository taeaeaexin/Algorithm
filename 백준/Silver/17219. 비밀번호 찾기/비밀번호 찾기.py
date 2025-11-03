import sys
input = sys.stdin.readline

N, M = map(int, input().split())
pw = {}
answer = []

for _ in range(N):
    address, password = input().split()
    pw[address] = password

for _ in range(M):
    tmp = input().strip()
    answer.append(pw[tmp])

for a in answer:
    print(a)