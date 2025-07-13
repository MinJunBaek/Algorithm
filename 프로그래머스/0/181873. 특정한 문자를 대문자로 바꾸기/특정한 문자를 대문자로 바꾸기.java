class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            String ch = String.valueOf(my_string.charAt(i));
            if (ch.equals(alp)){
                ch = ch.toUpperCase();
            }
            answer += ch;
        }
        return answer;
    }
}