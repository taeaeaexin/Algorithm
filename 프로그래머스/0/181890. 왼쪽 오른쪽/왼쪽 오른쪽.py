def solution(str_list):
    idx = -1
    for i in range(len(str_list)):
        if str_list[i] == 'l' or str_list[i] == 'r':
            idx = i
            break
            
    if idx == -1:
        return []
            
    if str_list[idx] == 'l':
        return str_list[:idx]
    elif str_list[idx] == 'r':
        return str_list[idx+1:]