import sys
input = sys.stdin.readline

tc = int(input().strip())

for _ in range(tc):
    n = int(input().strip())
    clothes = {}

    for _ in range(n):
        name, type = input().strip().split(' ')
        clothes[type] = clothes.get(type, 0) + 1

    result = 1
    for count in clothes.values():
        result *= (count + 1)

    print(result - 1)