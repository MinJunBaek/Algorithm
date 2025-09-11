import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] chArr1 = st.nextToken().toCharArray();
            char[] chArr2 = st.nextToken().toCharArray();
            if (isCheck(chArr1, chArr2)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
    
    private static boolean isCheck(char[] chArr1, char[] chArr2) {
        if (chArr1.length != chArr2.length) {
            return false;
        }
        
        int[] countArr = new int[26];
        
        for (int i = 0; i < chArr1.length; i++) {
            countArr[chArr1[i] - 'a']++;
            countArr[chArr2[i] - 'a']--;
        }
        
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}