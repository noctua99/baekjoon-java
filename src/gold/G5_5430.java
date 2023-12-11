package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine(), "[], ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            boolean reversed = false;
            int left = 0;
            int right = n - 1;
            boolean error = false;
            for (char c : cmd.toCharArray()) {
                if (c == 'R') {
                    reversed = !reversed;
                } else {
                    if (left > right) {
                        error = true;
                        sb.append("error").append('\n');
                        break;
                    }
                    if (!reversed) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            if (!error) {
                sb.append('[');
                if (left <= right) {
                    if (!reversed) {
                        for (int i = left; i < right; i++) {
                            sb.append(arr[i]).append(',');
                        }
                        sb.append(arr[right]);
                    } else {
                        for (int i = right; i > left; i--) {
                            sb.append(arr[i]).append(',');
                        }
                        sb.append(arr[left]);
                    }
                }
                sb.append(']').append('\n');
            }
        }

        System.out.println(sb);
    }
}
