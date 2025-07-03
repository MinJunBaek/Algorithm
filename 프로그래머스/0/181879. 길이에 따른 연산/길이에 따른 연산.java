class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        boolean flag = num_list.length >= 11 ? true : false;
        if(flag) {
            for(int num : num_list) {
                sum += num;
            }
            return sum;
        } else {
            for(int num : num_list) {
                product *= num;
            }
            return product;
        }
    }
}