def solution(num_list):
    odd = ""
    even = ""
    
    for n in range(len(num_list)):
        n = num_list[n]
        if n%2==0:
            even += str(n)
        else:
            odd += str(n)
    return int(even)+int(odd)