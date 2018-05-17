package tasks.task2002;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        new Solution().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = sc.nextInt();
        for (int i = 0; i < count; i++){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
