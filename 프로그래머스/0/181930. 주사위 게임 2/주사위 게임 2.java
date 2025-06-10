class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c && a == c) {
            answer = (a + b + c) * Solution.squareRoot(a , b, c) * Solution.cubeRoot(a, b, c);
        } else if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else {
            answer = (a + b + c) * Solution.squareRoot(a , b, c);
        }
        return answer;
    }
    
    public static int squareRoot(int a, int b, int c) {
        return (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }
    
    public static int cubeRoot(int a, int b, int c) {
        return (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
    }
}