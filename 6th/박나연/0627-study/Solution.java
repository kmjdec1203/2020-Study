class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        if(a>b){
            int tmp = 0;
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int i= a; i<=b; i++){
            sum += i;
        }
        return sum;
    }
}