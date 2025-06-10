class Solution {
    public int solution(int[] num_list) {
        StringBuilder evenNumber = new StringBuilder();
        StringBuilder oddNumber = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNumber.append(num_list[i]);
            } else {
                oddNumber.append(num_list[i]);
            }
        }
        int answer = Integer.parseInt(evenNumber.toString()) + Integer.parseInt(oddNumber.toString());
        return answer;
    }
}