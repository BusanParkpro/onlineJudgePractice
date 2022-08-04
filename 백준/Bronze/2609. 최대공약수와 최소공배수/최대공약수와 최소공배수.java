import java.io.*;
import java.util.*;

public class Main {
	static int a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int G = gcd(a, b);

		System.out.println(G);
		System.out.println(a * b / G);

	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}