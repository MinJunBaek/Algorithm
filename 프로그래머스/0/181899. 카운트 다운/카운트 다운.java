class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = 1 + start_num - end_num;
        int[] answer = new int[len];
        int number = start_num;
        for(int i = 0; i < len; i++) {
            answer[i] = number--;
        }
        return answer;
    }
}