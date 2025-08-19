package main

func solution(n int) int {
    i := 1
    for {
        if (6*i)%n == 0 {
            return i
        }
        i++
    }
}