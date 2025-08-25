import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch(n){
            case 1 : return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
            case 2 : return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3 : return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
            case 4 :
                int length = (slicer[1] - slicer[0])/slicer[2] + 1;
                int[] result = new int[length];
                int idx = 0;
                for(int i = slicer[0] ; i < slicer[1]+1 ; i+= slicer[2]) result[idx++] = num_list[i];
                return result;
        }
        return num_list;
    }
}