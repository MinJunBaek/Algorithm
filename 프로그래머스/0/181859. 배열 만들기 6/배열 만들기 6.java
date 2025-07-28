import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        Stack<Integer> stk = new Stack<>();
        int[] answer = {-1};
        while (i < arr.length) {
            if (stk.empty()) {
                stk.push(arr[i++]);
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop();
                    i++;
                } else {
                stk.push(arr[i++]); 
                }
            }
        }
        if(stk.empty()) {
            return answer;
        }
        
        answer = stk.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}