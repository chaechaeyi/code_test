class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0,0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length){
            if(target == sum) answer++;
        } else{
            dfs(numbers, target, idx+1, sum+numbers[idx]);
            dfs(numbers, target, idx+1, sum-numbers[idx]);
        }
    }
}