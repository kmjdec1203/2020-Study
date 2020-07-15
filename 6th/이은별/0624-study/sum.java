import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        System.out.println(solution(1,5));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        if (a <b)
            for(int i=a;i<=b;i++)
        {
            answer += i;
        }
        else if (a > b)
            for(int i=b;i<=a;i++)
                answer += i;
         else answer = a;
        return answer;
    }
}
