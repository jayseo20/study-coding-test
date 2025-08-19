package main

func solution(n int) int {
    count := 0
    for i := 1; i <= n; i++ {
        divisor := 0
        for j := 1; j <= i; j++ {
            if i%j == 0 {
                divisor++
            }
        }
        if divisor >= 3 {
            count++
        }
    }
    return count
}