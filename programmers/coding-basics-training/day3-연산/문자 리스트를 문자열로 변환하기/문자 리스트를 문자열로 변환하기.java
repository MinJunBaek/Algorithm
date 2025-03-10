class Solution {
  public String solution(String[] arr) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      stringBuilder.append(arr[i]);
    }
    String answer = stringBuilder.toString();
    return answer;
  }
}