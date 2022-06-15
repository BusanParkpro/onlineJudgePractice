import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(sol(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String sol(String str) {
        Stack<Character> stack = new Stack<>();

        for (char a : str.toCharArray()) {
            if (a == '(') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}