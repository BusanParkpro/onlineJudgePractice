import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a * b * c;
        int[] arr = new int[10];
        String str = String.valueOf(sum);

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 48]++;
        }

        for (int item : arr) {
            System.out.println(item);
        }
    }
}