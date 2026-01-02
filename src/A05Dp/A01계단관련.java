package A05Dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A01계단관련 {
//    멀리뛰기 : 프로그래머스

//    계단오르기 : 백준
    public static void main(String[] args) throws IOException {
//        int n = 4;
//        int MOD = 1234567;
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i < dp.length; i++) {
//            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
//
//        }
//        System.out.println(dp[n]);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length-1; i++) {
            dp[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }
        System.out.println(dp[n]);
    }
}
