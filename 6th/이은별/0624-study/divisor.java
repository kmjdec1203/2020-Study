public class divisor {
    public static void main(String[] args){
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;   //약수의 합을 저장하는 변수

        for(int i=1; i<=n; i++) { //1부터 n까지 반복
            if(n%i == 0) {  //만약 약수라면
                answer += i;  //answer에 i를 더함
            }
        }

        return answer;  //answer반환


    }

}
