package tasks.task2056;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        new Solution().run();
    }


    private void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        StringBuilder sb = new StringBuilder();
        int max = 0;

        while (reader.ready()) {
            String line = reader.readLine().toLowerCase();
            sb.append(line + " ");
        }
        Map<String, Integer> wordsMap = new TreeMap<>();

        String[] words = sb.toString().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (wordsMap.containsKey(words[i])) {
                wordsMap.put(words[i], wordsMap.get(words[i]) + 1);
                if (wordsMap.get(words[i]) > max)
                    max = wordsMap.get(words[i]);
            } else
                wordsMap.put(words[i], 1);
        }
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() == max)
                System.out.println(entry.getKey());
        }
    }
}

