import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(ch == 'c' && i < len -1) { // ch가 c 일때
                if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                    //ch 다음 문자가 = 이거나 - 일 때 i + 1까지 하나의 문자이므로 다음 문자를 건너 뜀
                }
            }
            else if(ch == 'd' && i < len - 1) { // ch가 d 일 때
                if(str.charAt(i + 1) == '-') { // d- 일 때
                    i++;
                } else if(str.charAt(i + 1) == 'z' && i < len - 2) { // dz= 일 때
                    if(str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }
            else if((ch == 'l' || ch == 'n') && i < len -1) { //ch가 l 이거나 n 일 때
                if(str.charAt(i + 1) == 'j') { // lj or nj 일 때
                    i++;
                }
            }
            else if((ch == 's' || ch == 'z') && i < len -1) { // ch 가 s 거나 z 일 때
                if(str.charAt(i + 1) == '=') { // s= or z= 일 때
                    i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}