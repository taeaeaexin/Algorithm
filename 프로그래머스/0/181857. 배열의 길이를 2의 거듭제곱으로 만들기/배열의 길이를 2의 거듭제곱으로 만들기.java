class Solution {
    public int[] solution(int[] arr) {
        double a = arr.length;
        int num = 1;
        while(a > 2){
            a /= 2;
            num++;
        }
        if (a == 2) return arr;
        if (arr.length == 1) return arr;
        
        int[] result = new int[(int)Math.pow(2, num)];
        int i = 0;
        while(i < arr.length){
            result[i] = arr[i];
            i++;
        }
        while(i+1 < result.length){
            result[i] = 0;
            i++;
        }
        
        return result;
    }
}