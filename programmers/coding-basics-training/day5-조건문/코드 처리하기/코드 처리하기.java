class Solution {
  public String solution(String code) {
    StringBuilder ret = new StringBuilder();
    int mode = 0;

    for (int idx = 0; idx < code.length(); idx++) {
      char ch = code.charAt(idx);
      // 읽다가 모드가 0이고 code[idx]가 1이면 1으로 변경
      // 읽다가 모드가 1이고 code[idx]가 1이면 0으로 변경
      if (ch == '1') {
        mode = 1 - mode;
      } else {
        if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
          ret.append(ch);
        }
      }
    }
    return ret.length() > 0 ? ret.toString() : "EMPTY";
  }
}