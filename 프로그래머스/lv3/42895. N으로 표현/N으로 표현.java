class Solution {
    
    private int n;
    private int target;
    private int answer = Integer.MAX_VALUE;

    public int solution(int N, int number) {
        n = N;
        target = number;
        dfs(0, 0);        
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private void dfs(int count, int prev) {
        if (count > 8) {
            answer = -1;
            return;
        }

        if (prev == target) {
            answer = Math.min(answer, count);
            return;
        }

        int tempN = n;
        for (int i = 0; i < 8 - count; i++) {
            int newCount = count + i + 1;
            dfs(newCount, prev + tempN);
            dfs(newCount, prev - tempN);
            dfs(newCount, prev / tempN);
            dfs(newCount, prev * tempN);

            tempN = tempN * 10 + n;
        }
    }
}