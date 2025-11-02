def solution(arr):
    min, max = 111111, 0
    for i in range(len(arr)):
        if arr[i] == 2:
            if i < min:
                min = i
            if i > max:
                max = i
                
    if min == 111111 and max == 0:
        return [-1]
        
    return arr[min:max+1]
                    
        