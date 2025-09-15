import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[] charArray = new int[26];
        int count = 0;
        for (char ch : str1.toCharArray()) {
            charArray[ch - 'a']++;
        }
        for (char ch : str2.toCharArray()) {
            charArray[ch - 'a']--;
        }
        for (int charNum : charArray) {
            count += Math.abs(charNum);
        }
        System.out.println(count);
    }
}