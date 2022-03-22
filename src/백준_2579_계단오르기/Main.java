package 백준_2579_계단오르기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //계단 수
        int n = s.nextInt();

        //각 계단의 점수
        int[] stair = new int[n+1];
        //현재 계단까지의 최고 점수
        int[] dp = new int[n+1];

        //계단입력
        for(int i = 1; i<=n; i++) {
            stair[i] = s.nextInt();
        }

        dp[1] = stair[1];
        //n=1일때는 인덱스 0,1밖에없어서
        // 인덱스가 배열 크기를 넘어가 ArrayIndexOutOfBoundsException 예외 발생
        if(n>=2) dp[2] = stair[1] + stair[2];
        for(int i = 3; i<=n; i++){
            dp[i] = Math.max(dp[i-2] + stair[i], dp[i-3] + stair[i-1] + stair[i]);
        }
        System.out.println(dp[n]);

    }
}
