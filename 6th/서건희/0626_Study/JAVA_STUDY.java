import java.util.Scanner;

public class JAVA_STUDY {
        public static long solution(int a, int b) {
            long r=0;

            if(a > b){
                r = b;
                for (int i = 1; i < a - b + 1; i++){
                    r += b + i;
                }
            }
            else if(a < b){
                r = a;
                for (int i = 1; i < b - a + 1; i++){
                    r += a + i;
                }
            }
            else{
                r = a;
            }

            return r;

        }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int c, d;
        c = a.nextInt();
        d = a.nextInt();

        System.out.println(solution(c, d));
    }
}