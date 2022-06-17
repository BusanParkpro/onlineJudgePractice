import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        boolean isPalindrome = true;
        int center = str.length() / 2;
        int last = str.length() - 1;

        for (int start = 0; start < center; start++) {
            if(str.charAt(start) != str.charAt(last - start)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome ? 1 : 0);
    }
}