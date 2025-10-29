def solution(code):
    answer = ""
    mode = 0
    
    for i in range(len(code)):
        if code[i] == "1":
            mode = 1 if mode == 0 else 0
        
        if mode == 0:
            if code[i] != "1" and i%2==0:
                answer += code[i]
        else:
            if code[i] != "1" and i%2==1:
                answer += code[i]
            
    return answer if answer else "EMPTY"