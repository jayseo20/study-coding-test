import java.util.HashSet;

public class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);              // 처음 본 문자면 저장
                result.append(ch);         // 결과에 추가
            }
        }

        return result.toString();
    }
}
