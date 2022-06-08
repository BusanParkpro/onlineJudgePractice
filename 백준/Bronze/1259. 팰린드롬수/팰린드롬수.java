import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (true) {
            str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            int left = 0;
            int right = str.length() - 1;
            boolean isPalindrome = true;

            while (left <= right) {
                if (str.charAt(left) != str.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}