package main

func gcd(a, b int) int {
    for b != 0 {
        a, b = b, a%b
    }
    return a
}

func solution(numer1 int, denom1 int, numer2 int, denom2 int) []int {
    // 통분
    numer := numer1*denom2 + numer2*denom1
    denom := denom1 * denom2

    // 최대공약수로 약분
    g := gcd(numer, denom)

    return []int{numer / g, denom / g}
}