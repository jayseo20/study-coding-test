package main

func solution(balls int, share int) int64 {
    d := share
    if balls-share < share {
        d = balls - share
    }
    if d == 0 {
        return 1
    }
    return solution(balls-1, d-1) * int64(balls) / int64(d)
}