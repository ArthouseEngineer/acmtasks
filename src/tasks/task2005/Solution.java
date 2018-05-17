package tasks.task2005;

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
        int length = nextInt(), count = 0;
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nextInt();
        }

        int min = arr[0], index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        out.println(index + 1);
        out.flush();
    }
}
