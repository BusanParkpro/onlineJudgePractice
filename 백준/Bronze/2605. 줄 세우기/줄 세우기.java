import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ticket = Integer.parseInt(br.readLine());
        int[] num = new int[ticket];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < ticket; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        for (int i = 2; i <= ticket; i++) {
            list.add(list.size() - num[i - 1], i);
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write (list.get(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}