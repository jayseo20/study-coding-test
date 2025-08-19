package main

func solution(chicken int) int {
    answer := 0
    coupon := chicken

    for coupon >= 10 {
        answer += coupon / 10
        coupon = coupon/10 + coupon%10
    }

    return answer
}