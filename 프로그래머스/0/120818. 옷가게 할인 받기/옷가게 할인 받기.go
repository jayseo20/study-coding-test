package main

func solution(price int) int {
    if price >= 500000 {
        return int(float64(price) * 0.8)
    } else if price >= 300000 {
        return int(float64(price) * 0.9)
    } else if price >= 100000 {
        return int(float64(price) * 0.95)
    }
    return price
}