package 백준_11399_ATM;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //사람수
        int n = s.nextInt();
        //인출시간 배열
        int[] time = new int[n];

        for(int i = 0; i < n; i++){
            time[i] = s.nextInt();
        }
        //오름차순 정렬
        Arrays.sort(time);

        int total = 0;
        int wait = 0;

        for(int i = 0; i < n; i++){
            //n번째 사람의 대기시간
            wait += time[i];
            //대기시간 누적합
            total += wait;
        }
        System.out.println(total);
    }
}
