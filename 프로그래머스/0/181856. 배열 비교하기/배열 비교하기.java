class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        
        if (arr1Len > arr2Len) {
            return 1;
        } else if (arr1Len < arr2Len) {
            return -1;
        }
        for (int i = 0; i < arr1Len; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        if (sum1 == sum2) {
            return 0;
        }
        
        int answer = sum1 >= sum2 ? 1 : -1;
        return answer;
    }
}