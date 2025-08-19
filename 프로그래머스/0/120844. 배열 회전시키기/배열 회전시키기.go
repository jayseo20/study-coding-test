package main

func solution(numbers []int, direction string) []int {
    n := len(numbers)

    if direction == "right" {
        // 맨 마지막 원소를 앞으로 보내고 나머지 이어 붙임
        return append([]int{numbers[n-1]}, numbers[:n-1]...)
    } else {
        // 맨 처음 원소를 뒤로 보내고 나머지 이어 붙임
        return append(numbers[1:], numbers[0])
    }
}