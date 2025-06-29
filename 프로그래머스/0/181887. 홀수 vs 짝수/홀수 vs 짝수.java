class Solution {
    public int solution(int[] num_list) {
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddNumber += num_list[i];
            } else {
                evenNumber += num_list[i];
            }
        }
        
        int answer = oddNumber >= evenNumber ? oddNumber : evenNumber;
        return answer;
    }
}