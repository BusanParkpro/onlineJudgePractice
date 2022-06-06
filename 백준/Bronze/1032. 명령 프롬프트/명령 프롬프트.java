import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        boolean same = true;

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }
        for(int i = 0; i < str[0].length(); i++) {
            for (int j = 1; j < N; j++) {
                if (str[0].charAt(i) == str[j].charAt(i)) {
                    same = true;
                } else {
                    same = false;
                    break;
                }
            }
            if(!same) {
                sb.append("?");
            } else {
                sb.append(str[0].charAt(i));
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}