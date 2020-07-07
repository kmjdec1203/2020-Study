import java.util.*;//자바는 입력 받는 scanner를 만들려면 이걸 선언해줘야 함/ *는 util에 포함된 모든 것을 사용하겠다는 의미
public class solution {//그냥 넌 class
    public static void main(String[] args){//java도 main은 필요하다 이거다. 지금은 main 선언 방법이라고만 알아두라 했다. 구글이
            Scanner sc=new Scanner(System.in);// c언어의 scnaf같은 느낌의 scanner를 선언해 줄거다.
            int a=sc.nextInt();//int형으로 입력을 받아서 a에 저장하자
            int b=sc.nextInt();//int형으로 입력 받아서 b에 저장하자
            long result= solution(a,b);//solution함수에 a,b를 보내주면서 호출하고 solution함수의 자료형인 long형으로 리턴값 받아오기
        System.out.println(result);//이건 잘 됐는지 보려고 한거임 ㅇㅇ/ solution함수의 리턴값을 출력
    }
    public static long solution(int a, int b) {//static은 정적인 느낌이라는데 아직 잘 모르겠다
        long answer = 0;//값을 더해줄 변수를 선언함/ long인 이유는 값의 범위가 크기 때문
        if(a>b){//a와 b의 대소관계가 정해져있지 않으므로 swap해준다
            int tmp=a;
            a=b;
            b=tmp;
        }
        for(int i=a;i<=b;i++){//a부터 b까지 answer변수에 값을 더해줄거임.
            answer+=i;
        }
        return answer; // 두 정수 사이의 합을 더해 놓은 변수를 리턴해줌.
    }
}
