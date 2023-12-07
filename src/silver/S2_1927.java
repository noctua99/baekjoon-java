package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S2_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                pq.offer(x);
            } else {
                if (pq.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(pq.poll());
                }
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}
