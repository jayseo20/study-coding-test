public class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" ");  // 공백 기준으로 자르기

        int result = Integer.parseInt(tokens[0]);  // 첫 번째 숫자로 초기화

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];            // 연산자 (+ or -)
            int number = Integer.parseInt(tokens[i + 1]);  // 다음 숫자

            if (operator.equals("+")) {
                result += number;
            } else {
                result -= number;
            }
        }
        return result;
    }
}
