import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long S = Long.parseLong(br.readLine());
        int cnt = 0;
        long sum = 0;

        while (sum <= S) {
            sum += (++cnt);
            }
        System.out.println(cnt - 1);
    }
}