import sys
input = sys.stdin.readline

N, M = map(int, input().split())
dictionary_word = {}
dictionary_number = {}

for i in range(1, N + 1):
    name = input().strip()
    dictionary_word[name] = i
    dictionary_number[i] = name

for _ in range(M):
    find = input().strip()
    if find.isdigit():
        print(dictionary_number[int(find)])
    else:
        print(dictionary_word[find])