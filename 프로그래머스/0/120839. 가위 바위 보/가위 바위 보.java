class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                    case '2' -> answer.append("0");
                    case '0' -> answer.append("5");
                    case '5' -> answer.append("2");
            }
        }
        return answer.toString();
    }
}