class Solution {
    public String solution(int age) {
        String strAge = age + "";
        StringBuilder answer = new StringBuilder(strAge.length());
        
        for (int i = 0; i < strAge.length(); i++) {
            int digit = strAge.charAt(i) - '0';
            char ageChar = (char) ('a' + digit);
            answer.append(ageChar);
        }
        return answer.toString();
    }
}