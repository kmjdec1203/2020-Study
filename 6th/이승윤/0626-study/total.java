import java.util.*;//util이라는 패키지 안에 있는 것을 모두 사용하기 위해 선언함/ #include같은 느낌이랄까

public class total{
    public static void main(String[] args) {//이것은 메인함수
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 0, 3, 3, 1})));
        /*자 출력을 할 겁니다. solution 메소드를 호출해서 리턴된 값을 출력할 겁니다/ 이땐 배열 이름이 없어도 괜찮나봐요..?
        Arrays는 배열의 모든 기능을 담은 클래스구요. .toString은 문자열의 형태로 출력할 거라는 얘기임
        만약 Arrays.toString이 없으면 리턴된 함수의 주소값을 출력함.
        배열에 들어있는 값을 출력하고 싶을 때는 toString을 사용한다고 생각하면 편함*/
    }
    public static int[] solution(int []arr) {
        int count = 0;//이건 배열에 값이 얼마만큼 들어갔는지 세어 줄 변수
        int[] answer = new int[arr.length];//answer배열은 정리된 값을 저장하는 배열이고, 길이는 arr의 길이만큼으로 지정해준다.
        for (int i = 0; i < arr.length; i++) {
            /*answer배열에 저장된 값과 arr의 값을 비교하면서 answer에 값을 저장할 거임!*/
            if (i == 0) answer[count++] = arr[i];
            /*지금 인덱스와 그 전 인덱스의 값을 비교할 건데, 만약 0번째 인덱스라면 비교대상이 없기 때문에
            비교 없이 값을 바로 넣어 주면 된다*/
            else if (answer[count-1] != arr[i]) answer[count++] = arr[i];
            /*만약, 정리된 배열 answer의 전 인덱스와 arr의 현재 인덱스의 값이 다르면-> 현재 answer의 인덱스에 현재 arr의 값을 넣어주고 count++*/
        }
        return Arrays.copyOf(answer, count);
        /*copyOf는 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환한다고 한다
        (a,b)가 있을 때, a는 배열의 이름/b는 그 배열의 길이를 지정해 준 것*/
    }
}