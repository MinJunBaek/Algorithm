import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charList = str.toCharArray();
        for(int i = 0; i < charList.length; i++){
            if (charList[i] <= 96) {
                charList[i] = Character.toLowerCase(charList[i]);
            } else {
                charList[i] = Character.toUpperCase(charList[i]);
            }
        }
        System.out.println(charList);
    }
}