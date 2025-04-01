public class Solution {
    public int solution(int[] array) {
        int count = 0;

        for (int num : array) {
            String str = String.valueOf(num);  // 숫자를 문자열로 변환

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '7') {
                    count++;  // '7'이 있으면 카운트 증가
                }
            }
        }

        return count;
    }
}
