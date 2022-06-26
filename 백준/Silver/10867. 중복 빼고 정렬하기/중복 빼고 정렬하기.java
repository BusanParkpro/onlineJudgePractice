import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        SortedSet<Integer> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(Integer.valueOf(num));
        }

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}