import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] small = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                       'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] big = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                       'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(int i = 0 ; i < a.length() ; i++){
            char chr = a.charAt(i);
            boolean flag = true;
            
            for(int j = 0 ; j < small.length ; j++){
                if(chr == small[j]){
                    flag = false;
                    a = a.substring(0,i) + big[j] + a.substring(i+1);
                }
            }
            if(flag){
                for(int j = 0 ; j < big.length ; j++){
                    if(chr == big[j]){
                        flag = false;
                        a = a.substring(0,i) + small[j] + a.substring(i+1);
                    }
                }
            }
        }
        System.out.println(a);
    }
}