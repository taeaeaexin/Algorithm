class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_len_int = Integer.parseInt(video_len.substring(0,2)) * 60 + Integer.parseInt(video_len.substring(3,5));
        int pos_int = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3,5));
        int op_start_int = Integer.parseInt(op_start.substring(0,2)) * 60 + Integer.parseInt(op_start.substring(3,5));
        int op_end_int = Integer.parseInt(op_end.substring(0,2)) * 60 + Integer.parseInt(op_end.substring(3,5));
        
        if(op_start_int <= pos_int && pos_int <= op_end_int) {
            pos_int = op_end_int;
        }
        
        for(int i = 0 ; i < commands.length ; i++){
            switch (commands[i]) {
                case "prev" : 
                    if(pos_int < 10) pos_int = 0;
                    else pos_int -= 10;
                    break;
                case "next" :
                    if(pos_int + 10 > video_len_int) pos_int = video_len_int;
                    else pos_int += 10;
                    break;
            }
            
            if(op_start_int <= pos_int && pos_int <= op_end_int) {
                pos_int = op_end_int;
            }
        }
        String hh = String.format("%02d", pos_int / 60);
        String mm = String.format("%02d", pos_int % 60);
        return hh+":"+mm;
    }
}