import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int exponent = 0;
        int size = (int) Math.pow(2, exponent);
        
        while (true) {
            if (length > size) {
                exponent++;
                size = (int) Math.pow(2, exponent);
            } else {
                break;
            }
        }
        
        int[] answer = Arrays.copyOf(arr, size);
        
        return answer;
    }
}