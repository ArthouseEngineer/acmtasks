package tasks.task2001;

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


    public void solve() throws IOException {
        int a = 0;
        int b = 0;
        a = nextInt();
        b = nextInt();
        out.println(a + b);
        out.flush();
    }
}
