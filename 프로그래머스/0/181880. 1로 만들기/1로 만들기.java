class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list) {
            int operation = num;
            while(operation != 1) {
                if(operation % 2 == 0) {
                    operation /= 2;
                    answer++;
                } else {
                    operation = (operation - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}