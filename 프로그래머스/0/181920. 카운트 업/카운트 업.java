import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        int index = start_num;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = index++;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}