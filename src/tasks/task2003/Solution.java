package tasks.task2003;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        new Solution().run();
    }

    StreamTokenizer in;
    PrintWriter out;

    private int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
    }

    private void solve() throws IOException {
        int sum = 0,count = nextInt(), sign = 1;
        for (int i = 0; i < count; i++){
            sum = sum + nextInt() * sign;
            sign *= -1;
        }
        out.println(sum);
        out.flush();
    }
}
