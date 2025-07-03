import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] beforeArr = Arrays.copyOfRange(arr, 0, arr.length);
        int[] afterArr = new int[arr.length];

        while(true){
            for(int i = 0; i < beforeArr.length; i++) {
                if(beforeArr[i] >= 50 && beforeArr[i] % 2 == 0) {
                    afterArr[i] = beforeArr[i] / 2;
                } else if (beforeArr[i] < 50 && beforeArr[i] % 2 != 0) {
                    afterArr[i] = beforeArr[i] * 2 + 1;
                } else {
                    afterArr[i] = beforeArr[i];
                }
            }
            
            if (Arrays.mismatch(beforeArr, 0, beforeArr.length, afterArr, 0, afterArr.length) == -1) {
                break;
            }
            beforeArr = Arrays.copyOfRange(afterArr, 0, afterArr.length);
            answer += 1;
        }
        return answer;
    }
}