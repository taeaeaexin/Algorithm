class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        
        int x = 0, y = 0, num = 1, dir = 0;
        while(num < n*n+1){
            answer[y][x] = num++;
            visited[y][x] = true;
            
            int ny = y+dy[dir];
            int nx = x+dx[dir];
            
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[ny][nx]){
                y = ny;
                x = nx;
            }else{
                dir = (dir+1)%4;
                x += dx[dir];
                y += dy[dir];
            }
        }
        return answer;
    }
}