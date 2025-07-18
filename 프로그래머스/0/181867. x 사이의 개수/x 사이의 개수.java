class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        int[] answer = new int[strArr.length];
        int index = 0;
        for(String str : strArr) {
            answer[index++] = str.length();
        }
        
        return answer;
    }
}