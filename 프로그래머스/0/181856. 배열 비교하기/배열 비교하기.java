class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length) return 1;
            return -1;
        }else{
            int n1 = 0, n2 = 0;
            for(int i = 0 ; i < arr1.length ; i++){
                n1 += arr1[i];
                n2 += arr2[i];
            }
            return n1 == n2 ? 0 : (n1 > n2 ? 1 : -1);
        }
    }
}