import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] b = str.toCharArray();

        System.out.println(a * (b[2] - '0'));
        System.out.println(a * (b[1] - '0'));
        System.out.println(a * (b[0] - '0'));
        System.out.println(a * Integer.parseInt(str));
    }
}
