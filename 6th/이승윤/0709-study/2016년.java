import java.util.*;
//1월 1일 금요일
public class hi {
    public static void main(String[]args){
        int a=5;
        int b=24;
        System.out.println(solution(a,b));
    }
    public static String solution(int a, int b) {//0이면 금요일 1이면
        String[] day={"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int sum=0;
        int[] d={31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<a-1;i++){
            sum=sum+d[i];
        }
        sum=sum+b;
        switch(sum%7){
            case 0: return day[0];
            case 1: return day[1];
            case 2: return day[2];
            case 3: return day[3];
            case 4: return day[4];
            case 5: return day[5];
            case 6: return day[6];
            default: return "";
        }
    }
}
