package tasks.task2038;

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        new Solution().run();
    }

    StreamTokenizer in;
    PrintWriter out;


    private void run() throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        solve();
    }

    private void solve() throws IOException {
        String word, max = "";
        int start = 0;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            int numberOfChar = word.charAt(i);
            if (numberOfChar > 32 && numberOfChar < 127) {
            } else {
                if (i - start > max.length()) {
                    max = word.substring(start, i);
                }
                start = i + 1;
            }
        }
        out.print(max.length());
        out.flush();
    }
}
