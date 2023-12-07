package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] dp = new long[42];
        dp[0] = dp[2] = 1;
        for (int i = 3; i < 42; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append(" ").append(dp[n + 1]).append("\n");
        }

        System.out.println(sb);
    }
}
