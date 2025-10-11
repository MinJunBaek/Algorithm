import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        long numberA = (long) numbers[0] * numbers[1];
        long numberB = (long) numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int answer = numberA >= numberB ? (int) numberA : (int) numberB;
        return answer;
    }
}