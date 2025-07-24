class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        int a = Integer.valueOf(arr[0]);
        String op = arr[1];
        int b = Integer.valueOf(arr[2]);
        
        switch(op){
            case "+" -> answer = a + b;
            case "-" -> answer = a - b;
            case "*" -> answer = a * b;
            
        }
        return answer;
    }
}