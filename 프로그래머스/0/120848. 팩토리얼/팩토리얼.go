package main

func solution(n int) int {
    fact := 1
    i := 1
    for fact <= n {
        i++
        fact *= i
    }
    return i - 1
}