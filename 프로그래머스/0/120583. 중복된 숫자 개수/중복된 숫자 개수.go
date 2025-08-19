package main

func solution(array []int, n int) int {
    count := 0
    for _, v := range array {
        if v == n {
            count++
        }
    }
    return count
}