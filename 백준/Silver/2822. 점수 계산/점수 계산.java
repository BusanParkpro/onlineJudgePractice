import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> tm = new TreeMap<>();

        for (int i = 0; i < 8; i++) {
            tm.put(Integer.parseInt(br.readLine()), (i + 1) + "");
        }
        int sum = 0;
        String[] str = new String[5];
        int a = 0;
        
        for (Integer key : tm.descendingMap().keySet()) {
            sum += key;
            str[a] = tm.get(key);
            
            if (a == 4)
                break;
            a++;
        }
        Arrays.sort(str);
        System.out.println(sum);
        
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if (i != str.length -1) {
                System.out.print(" ");
            }
        }
    }
}