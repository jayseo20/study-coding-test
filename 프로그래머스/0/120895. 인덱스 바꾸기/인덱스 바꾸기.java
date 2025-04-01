public class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환

        // 두 위치의 문자 swap
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        return new String(arr); // 배열을 문자열로 다시 변환하여 리턴
    }
}
