class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int second = 0;
            
            for(int j = i; j < prices.length - 1; j++) {

                if (price <= prices[j]) {
                    second++;
                } else {
                    break;
                }
            }
            
            answer[i] = second;
        }
        return answer;
    }
}