import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] array = a.toCharArray();
    for (int i = 0; i < a.length(); i++) {
      int num = array[i];
      if ((65 <= num) && (num <= 90)) {
        array[i] = (char) (num + 32);
      } else {
        array[i] = (char) (num - 32);
      }
    }
    System.out.println(array);
  }
}