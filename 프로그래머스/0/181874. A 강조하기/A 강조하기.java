class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            String ch = String.valueOf(myString.charAt(i));
            if(ch.equals("a") || ch.equals("A")) {
                ch = ch.toUpperCase();
            } else {
                ch = ch.toLowerCase();
            }
            answer += ch;
        }
        return answer;
    }
}