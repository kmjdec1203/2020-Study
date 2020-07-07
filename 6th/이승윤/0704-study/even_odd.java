import java.util.*;

public class even_odd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();//sc 이용해서 int형 입력받기
        System.out.println(solution(num));//메소드 호출할건데 왜 안되는가-> 메소드를 static으로 선언해주니까 됐음. 근데 이유는 모름
    }
    public static String solution(int num) {
        String answer;
        if(num%2==0)answer="Even";//짝수면 "Even"저장
        else answer="Odd";//홀수면 "Odd" 저장
        return answer;
        //return num%2==0?"Even":"Odd"; //자바도 삼항연산자 가능-> 확 짧아짐.
    }
}
