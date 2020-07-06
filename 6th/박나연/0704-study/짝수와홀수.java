import java.util.Scanner;

public class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        Solution solution = new Solution();

        System.out.println(solution.solution(num));
    }
}



