def solution(ineq, eq, n, m):
    op = ineq+eq
    if(op == ">="):
        return int(n>=m)
    elif(op == "<="):
        return int(n<=m)
    elif(op == ">!"):
        return int(n>m)
    elif(op == "<!"):
        return int(n<m)
    return 0