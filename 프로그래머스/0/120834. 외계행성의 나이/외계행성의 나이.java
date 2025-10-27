class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        while (age > 0) {
            answer.insert(0, charArr[age % 10]);
            age /= 10;
        }
        
        return answer.toString();
    }
}