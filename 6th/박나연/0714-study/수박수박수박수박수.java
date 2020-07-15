import java.util.Scanner;

public class homework {
    static class Solution {
        public static String solution(int n) {
            String answer = "";
            for (int i=0;i<n;i++){
                if (i%2==0) answer+=("수");
                else answer+=("박");
            }
            return answer;
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();

        Solution solution = new Solution();
        System.out.println(Solution.solution(a));
    }
}
