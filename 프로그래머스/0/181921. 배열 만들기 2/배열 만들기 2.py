def solution(l, r):
    answer = []
    for i in range(l,r+1):
        s = str(i)
        flag = True
        for ch in s:
            if ch not in ('0', '5'):
                flag = False
                break
        if flag:
            answer.append(i)
            
    return answer if answer else [-1]