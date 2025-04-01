public class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            for (int j = 0; j < n; j++) {
                result.append(ch);  // 문자를 n번 반복
            }
        }

        return result.toString();
    }
}