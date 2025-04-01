public class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0; // 처음부터 같은 경우

        for (int i = 1; i < A.length(); i++) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1); // 오른쪽으로 한 칸 밀기

            if (A.equals(B)) return i; // 같아졌으면 현재 횟수 반환
        }

        return -1; // 끝까지 안 같아졌으면 -1
    }

}
