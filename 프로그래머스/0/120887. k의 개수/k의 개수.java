public class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        String target = String.valueOf(k);

        for (int n = i; n <= j; n++) {
            String numStr = String.valueOf(n);

            for (int x = 0; x < numStr.length(); x++) {
                if (String.valueOf(numStr.charAt(x)).equals(target)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 13, 1));   // 6
        System.out.println(s.solution(10, 50, 5));  // 5
        System.out.println(s.solution(3, 10, 2));   // 0
    }
}
