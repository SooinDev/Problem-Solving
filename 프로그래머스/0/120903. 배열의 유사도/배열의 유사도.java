public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] arr1 = new String[] {"a", "b", "c"};
        String[] arr2 = new String[] {"com", "b", "d", "p", "c"};

        int result = sol.solution(arr1, arr2);

        System.out.println(result);
    }
}