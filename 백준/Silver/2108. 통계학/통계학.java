import java.io.*;
import java.util.*;

public class Main {
    private static int[] cnt = new int[8001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            cnt[num + 4000]++;
            nums[i] = num;
        }
        bw.write(average(nums) + "\n");
        bw.write(median(nums) + "\n");
        bw.write(mode() + "\n");
        bw.write(range(nums) + "\n");
        
        bw.flush();
        bw.close();

    }
    
    static int average(int[] nums) {
        
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        float result = Math.round((float) sum / nums.length);
        
        return (int) result;
    }
    
    static int median(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    
    static int mode() {
        List<Integer> tmp = new ArrayList<>();
        int max = cnt[0];
        tmp.add(0 - 4000);
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == max) {
                tmp.add(i - 4000);
            } else if (cnt[i] > max) {
                max = cnt[i];
                tmp.clear();
                tmp.add(i - 4000);
            }
        }
        if (tmp.size() > 1) {
            Collections.sort(tmp);
            return tmp.get(1);
        } else {
            return tmp.get(0);
        }
    }
    
    static int range(int[] nums) {
        return nums[nums.length - 1] - nums[0];
    }
}