import java.util.*;
class Solution {
    class Position {
        private int x;
        private int y;
        
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        boolean  isValid(int width, int height){
            if(x < 0 || x >= width) return false;
            if(y < 0 || y >= height) return false;
            return true;
        }
    }
    
   public int solution(int[][] maps) {        
        int width = maps.length;
        int height = maps[0].length;
        
        int[][] count = new int[width][height];        
        boolean[][] visited = new boolean[width][height];
        Queue<Position> que = new LinkedList<>();
        
        count[0][0] = 1;
        visited[0][0] = true;
        que.offer(new Position(0,0));
        
        while(!que.isEmpty()){
            Position current = que.poll();
            int currentCount = count[current.x][current.y];
            
            final int[][] moving = {{-1,0},{0,1},{0,-1},{1,0}};
            for(int[] move: moving){                
                Position moved = new Position(current.x+move[0], current.y+move[1]);
                
                // 범위를 벗어나는지 확인 
                if(!moved.isValid(width, height)) continue;
                // 방문 한 이력이 있는지 확인
                if(visited[moved.x][moved.y]) continue;
                // 벽인지 길인지 확인
                if(maps[moved.x][moved.y] == 0) continue;
                
                // 현재 경로가 몇번째인지 확인
                count[moved.x][moved.y] = currentCount + 1;
                // 방문 체크
                visited[moved.x][moved.y] = true;
                // 현재 경로 저장
                que.offer(moved);                    
                
            }
        }
        
      int answer = count[width-1][height-1];
        if(answer == 0) return -1;
            
        return answer;
   }
}