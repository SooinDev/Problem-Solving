class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
            if (answer > n)
                break;
        }

        System.out.println(answer);

        return answer;
    }
}