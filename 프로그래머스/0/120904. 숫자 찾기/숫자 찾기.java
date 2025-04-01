public class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);     // 정수를 문자열로 변환
        String strK = String.valueOf(k);         // k도 문자열로 변환

        int index = strNum.indexOf(strK);        // 문자열에서 k의 위치 찾기

        return (index == -1) ? -1 : index + 1;   // 자바는 0부터 시작 → 1 더해줘야 함
    }
}
