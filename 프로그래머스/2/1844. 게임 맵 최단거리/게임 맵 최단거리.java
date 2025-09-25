import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,1});
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            int move = arr[2];
            if(x == n-1 && y == m-1) return move;
            
            for(int i = 0 ; i < 4 ; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < m){
                    if(!visited[nx][ny] && maps[nx][ny] == 1){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny, move+1});
                    }
                }
            }
        }
        
        return -1;
    }
}