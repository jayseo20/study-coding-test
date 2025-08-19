package main

import "strconv"

func solution(i int, j int, k int) int {
    count := 0
    target := strconv.Itoa(k)

    for x := i; x <= j; x++ {
        s := strconv.Itoa(x)
        for _, ch := range s {
            if string(ch) == target {
                count++
            }
        }
    }
    return count
}