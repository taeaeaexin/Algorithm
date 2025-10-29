def solution(num_list):
    sum = 0
    mul = 1
    for n in num_list:
        mul *= n
        sum += n
    return 0 if mul > sum**2 else 1