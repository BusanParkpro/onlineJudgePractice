import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[9];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int index = 0;
        int count = 0;

        for (int item : intArray) {
            count++;
            if(item > max) {
                max = item;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);

        }
    }