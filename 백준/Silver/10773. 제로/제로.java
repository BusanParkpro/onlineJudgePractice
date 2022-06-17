import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        while (K --> 0) {
            int n = Integer.parseInt(br.readLine());
            if (n > 0) {
                stack.push(n);
            } else
                stack.pop();
        }
        int sum = 0;
        while (stack.size() > 0) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}