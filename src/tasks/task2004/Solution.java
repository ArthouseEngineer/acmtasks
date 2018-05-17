package tasks.task2004;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        solution.run();
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
        int year = nextInt();
        byte flag;
        flag = (byte)(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 :  0);
        out.println(flag);
        out.flush();
    }
}
