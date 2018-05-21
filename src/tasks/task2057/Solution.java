package tasks.task2057;


import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        List<Integer> queryResult = new ArrayList<>();

        int size = Integer.parseInt(reader.readLine());

        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            int[] Perform = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (Perform[0] == 1) {
                if (treeMap.containsKey(Perform[1]))
                    treeMap.put(Perform[1], treeMap.get(Perform[1]) + 1);
                else
                    treeMap.put(Perform[1], 1);
            } else if (Perform[0] == 2) {
                int key = treeMap.keySet().iterator().next();
                queryResult.add(key);
                int value = treeMap.get(key);
                if (value - 1 >= 1) {
                    treeMap.put(key, --value);
                } else treeMap.remove(key);
            }
        }
        print(queryResult);
    }

    public static void print(Collection<Integer> collection) {
        for (Iterator<Integer> it = collection.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
