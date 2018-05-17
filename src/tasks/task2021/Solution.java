package tasks.task2021;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        int count = nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < count; i++)
            integerList.add(nextInt());

        for (int i = 0; i < 2; i++) {
            int max = Collections.max(integerList);
            for (int j = 0; j < count; j++) {
                if (integerList.get(j).equals(max)) {
                    integerList.set(j, max / 2);
                }
            }
        }
        for (int i = 0; i < count; i++)
            out.print(integerList.get(i) + " ");

        out.flush();
    }
}
