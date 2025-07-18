class Solution {
    public int[] solution(String myString) {
        int len = myString.replaceAll("[^x]", "").length() + 1;
        int[] answer = new int[len];
        int index = 0;
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                answer[index++] = count;
                count = 0;
            } else {
                count++;
            }
        }
        answer[index++] = count;
        return answer;
    }
}