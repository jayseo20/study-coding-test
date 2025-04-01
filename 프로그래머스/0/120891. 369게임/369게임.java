public class Solution {
    public int solution(int order) {
        int clapCount = 0;
        String str = String.valueOf(order);  // 정수를 문자열로 변환

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '3' || ch == '6' || ch == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }

   
}
