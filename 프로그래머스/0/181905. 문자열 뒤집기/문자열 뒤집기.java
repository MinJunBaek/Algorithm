class Solution {
    public String solution(String my_string, int s, int e) {
        // 뒤집을 문자열을 가져와 뒤집는다
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1)).reverse();
        StringBuilder sbAnswer = new StringBuilder(my_string);
        sbAnswer.replace(s, e + 1, sb.toString());
        String answer = sbAnswer.toString();
        return answer;
    }
}