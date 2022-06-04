class Solution {
    public int solution(String s) {
        String[] sArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(sArr[i], Integer.toString(i));
        }
       
        return Integer.parseInt(s);
    }
}