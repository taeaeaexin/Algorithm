class Solution {
    public int solution(int n, int w, int num) {
        int[][] box = new int[n/w + 1][w];
        int height = 0;
        int width = 0;
        int f_height = 0;
        int f_width = 0;
        
        for(int i = 1 ; i <= n ; i++){
            box[height][width] = i;
            
            if(i == num) {
                f_height = height;
                f_width = width;
            }
            
            if(height%2 == 0) width++;
            else width--;
            
            if(width > w-1) {
                height++;
                width = w-1;
            }else if(width < 0){
                height++;
                width = 0;
            }
        }
        
        if(box[n/w][f_width] == 0) return n/w - f_height;
        else return n/w + 1 - f_height;
    }
}