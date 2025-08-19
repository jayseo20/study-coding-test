package main

func solution(money int) []int {
    cups := money / 5500
    change := money % 5500
    return []int{cups, change}
}