package week_3;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candidate = new int[9];



        for (int i = 0; i < 9; i++) {
            candidate[i] = sc.nextInt();
        }


        Arrays.sort(candidate);


        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int currentHeight = 0;


                for (int k = 0; k < 9; k++) {
                    if (k != i && k != j) {
                        currentHeight += candidate[k];
                    }
                }


                if (currentHeight == 100) {

                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(candidate[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}
