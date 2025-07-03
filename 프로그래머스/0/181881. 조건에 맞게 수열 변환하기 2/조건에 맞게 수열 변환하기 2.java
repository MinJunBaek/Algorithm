import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] beforeArr = Arrays.copyOf(arr, arr.length);

        while(true){
            int[] afterArr = new int[arr.length];
            boolean isSame = true;
            
            for(int i = 0; i < beforeArr.length; i++) {
                if(beforeArr[i] >= 50 && beforeArr[i] % 2 == 0) {
                    afterArr[i] = beforeArr[i] / 2;
                } else if (beforeArr[i] < 50 && beforeArr[i] % 2 != 0) {
                    afterArr[i] = beforeArr[i] * 2 + 1;
                } else {
                    afterArr[i] = beforeArr[i];
                }
                if (beforeArr[i] != afterArr[i]) {
                    isSame = false;
                }
            }
            if (isSame) {
                break;
            }
            beforeArr = afterArr;
            answer += 1;
        }
        return answer;
    }
}