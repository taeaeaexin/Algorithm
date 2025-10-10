class Solution {
    public int solution(String binomial) {
        String[] operator = binomial.split(" ");
        switch(operator[1]){
            case "+" : return Integer.valueOf(operator[0])+Integer.valueOf(operator[2]);
            case "-" : return Integer.valueOf(operator[0])-Integer.valueOf(operator[2]);
            case "*" : return Integer.valueOf(operator[0])*Integer.valueOf(operator[2]);
        }
        return -1;
    }
}