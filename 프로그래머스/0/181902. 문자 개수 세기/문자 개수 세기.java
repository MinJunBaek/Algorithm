class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            int ascii = my_string.charAt(i);
            if (my_string.charAt(i) < 97) {
                answer[ascii-'A'] += 1;
            } else {
                answer[ascii-'a'+26] += 1;
            }
        }
        return answer;
    }
}