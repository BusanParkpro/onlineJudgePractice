import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] myStack;
    public static int size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        myStack = new int[N];
        StringBuilder sb = new StringBuilder();

        while (N--> 0) {
            st = new StringTokenizer(br.readLine()," ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int item) {
        myStack[size] = item;
        size++;
    }
    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = myStack[size - 1];
            myStack[size - 1] = 0;
            size--;
            return res;
        }
    }
    public static int size() {
        return size;
    }
    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return myStack[size - 1];
        }
    }
}