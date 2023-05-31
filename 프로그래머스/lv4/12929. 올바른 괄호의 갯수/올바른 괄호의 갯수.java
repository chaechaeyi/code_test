import java.util.*;
class Solution {
    class Option{
        int open, close;
        
        public Option(int open, int close){
            this.open = open;
            this.close = close;
        }
    }
    
    public int solution(int n) {
        int answer = 0;
        
        Stack<Option> stack = new Stack();
        stack.push(new Option(0,0));
        
        while(!stack.isEmpty()){
            Option option = stack.pop();
            
            //시작은 open으로 시작해야한다. 
            if(option.open > n) continue;
            //open이 있으면 닫힘이 있어야 한다. 
            if(option.open < option.close) continue;
            //열림 닫힘을 모두 소진하면 더이상 loop를 돌 필요가 없다.    
            if(option.open + option.close == 2*n) {
                answer++;
                continue;
            }            
        
            stack.push(new Option(option.open+1, option.close));
            stack.push(new Option(option.open, option.close+1));
        }       
        
        
        return answer;
    }
}