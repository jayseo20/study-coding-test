def fecto(n):
    f = 1 
    for i in range(1, n+1):
        f *= i
    return f

def solution(balls, share):

    answer = fecto(balls) / (fecto(balls - share) * fecto(share))
    return answer

print(solution(3 , 2))
print(solution(5, 3))