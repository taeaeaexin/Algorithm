import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0 ; i < s.length() ; i++){
            Stack<Character> stack = new Stack<>();
            int n = i;
            boolean flag = true;
            for(int j = 0 ; j < s.length() ; j++){
                n %= s.length();
                // if(n >= s.length()) n = 0;
                char c = s.charAt(n);
                switch(c){
                    case '(' :
                        stack.add('(');
                        break;
                    case '[' :
                        stack.add('[');
                        break;
                    case '{' :
                        stack.add('{');
                        break;
                    case ')' : 
                        if(stack.isEmpty() || stack.peek() != '(') {
                            flag = false;
                            break;
                        }
                        stack.pop();
                        break;
                    case ']' : 
                        if(stack.isEmpty() || stack.peek() != '[') {
                            flag = false;
                            break;
                        }
                        stack.pop();
                        break;
                    case '}' :
                        if(stack.isEmpty() || stack.peek() != '{') {
                            flag = false;
                            break;
                        }
                        stack.pop();
                        break;
                }
                n++;
            }
            if(flag && stack.isEmpty()) answer++;
        }
        return answer;
    }
}