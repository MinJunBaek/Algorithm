import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        int answer = numbers[len - 1] * numbers[len - 2];
        return answer;
    }
}