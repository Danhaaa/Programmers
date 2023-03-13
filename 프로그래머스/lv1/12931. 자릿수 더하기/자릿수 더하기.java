public class Solution {
    public int solution(int num) {
        int answer = 0;
       
        while(0 < num){
       answer += num % 10;
        
        num /= 10;
        }
        return answer;
    }
}