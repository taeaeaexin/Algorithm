import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        int x = 0, y = 0;
        int answer = 0;
        for(int i = 0 ; i < dirs.length() ; i++){
            char dir = dirs.charAt(i);
            int nx = 0;
            int ny = 0;
            String line = "";
            String line2 = "";
            switch(dir){
                case 'U' : 
                    nx = x+dx[0];
                    ny = y+dy[0];
                    if(nx < -5 || nx > 5 || ny < -5 || ny > 5) break;
                    line = x+nx+" "+y+ny;
                    line2 = nx+x+" "+ny+y;
                    if(!visited.contains(line) || !visited.contains(line2)){
                        answer++;
                        visited.add(line);
                        visited.add(line2);
                    }
                    x = nx;
                    y = ny;
                    break;
                case 'D' : 
                    nx = x+dx[1];
                    ny = y+dy[1];
                    if(nx < -5 || nx > 5 || ny < -5 || ny > 5) break;
                    line = x+nx+" "+y+ny;
                    line2 = nx+x+" "+ny+y;
                    if(!visited.contains(line) || !visited.contains(line2)){
                        answer++;
                        visited.add(line);
                        visited.add(line2);
                    }
                    x = nx;
                    y = ny;
                    break;
                case 'R' :
                    nx = x+dx[2];
                    ny = y+dy[2];
                    if(nx < -5 || nx > 5 || ny < -5 || ny > 5) break;
                    line = x+nx+" "+y+ny;
                    line2 = nx+x+" "+ny+y;
                    if(!visited.contains(line) || !visited.contains(line2)){
                        answer++;
                        visited.add(line);
                        visited.add(line2);
                    }
                    x = nx;
                    y = ny;
                    break;
                case 'L' :
                    nx = x+dx[3];
                    ny = y+dy[3];
                    if(nx < -5 || nx > 5 || ny < -5 || ny > 5) break;
                    line = x+nx+" "+y+ny;
                    line2 = nx+x+" "+ny+y;
                    if(!visited.contains(line) || !visited.contains(line2)){
                        answer++;
                        visited.add(line);
                        visited.add(line2);
                    }
                    x = nx;
                    y = ny;
                    break;
            }
        }
        return answer;
    }
}