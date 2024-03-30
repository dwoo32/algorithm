package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2231 {

    public static void main(String[] arge) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0 ; i < N ;i++) {

            int num = find(i);

            if(num == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static int find(int num) {
        int number = num;

        while(num != 0) {
            number = number + (num % 10);
            num = num / 10;
        }
        return number;
    }
}