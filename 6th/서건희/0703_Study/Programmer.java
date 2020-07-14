import java.util.ArrayList;
import java.util.List;

public class Programmer {

    public static String solution(String s) {
        String answer;
        String[] word = new String[s.length()];
        word = s.split("");
        if (word.length % 2 != 0) {
            answer = word[word.length / 2];
        } else {
            answer = word[word.length / 2 - 1] + word[word.length / 2];
        }
        return answer;
    }


    public static void main(String[] args) {
        String s = "abcdef";        //원하는 숫자 입력

        System.out.println(solution(s));
    }
}