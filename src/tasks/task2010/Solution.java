package tasks.task2010;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        new Solution().run();
    }

    StreamTokenizer in;
    PrintWriter out;

    public int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
    }


    public void solve() throws IOException {
        int a = nextInt(), b = nextInt(), count = 0;
        while ((a != 0) && (b != 0)) {
            if (a > b)
                a -= b;
            else
                b -= a;
            count++;
        }
        out.println(count);
        out.print(Math.max(a, b));
        out.flush();
    }
}
