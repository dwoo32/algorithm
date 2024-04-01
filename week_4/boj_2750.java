package week_4;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2750 {
    public static void main(String[] args){

            int n;
            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            int [] array = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for (int num : array) {
            System.out.println(num);
        }



        }
}
