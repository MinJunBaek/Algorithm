class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = code.toCharArray();
        int mode = 0;
        
        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '1') {
                mode = mode == 0 ? 1 : 0;
            } else if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                sb.append(charArray[i]);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}