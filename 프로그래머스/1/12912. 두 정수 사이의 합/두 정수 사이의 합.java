class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else if (a == b) {
            answer = a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        System.out.println(answer);
        return answer;
    }
}