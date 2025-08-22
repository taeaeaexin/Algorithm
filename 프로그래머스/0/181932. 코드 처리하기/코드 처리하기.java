class Solution {
    public String solution(String code) {
        int mode = 0;
        String result = "";
        for(int idx = 0 ; idx < code.length() ; idx++){
            if(code.charAt(idx) == '1'){
                if(mode == 0) mode = 1;
                else mode = 0;
                continue;
            }
            switch (mode) {
                case 0 : 
                    if(idx % 2 == 0) result += code.charAt(idx);
                    break;
                case 1 : 
                    if(idx % 2 == 1) result += code.charAt(idx);
                    break;
            }
        }
        return result.isEmpty()?"EMPTY":result;
    }
}