package week_2;

import java.util.Scanner;

public class boj_2609 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c= gcd(a,b);
        System.out.println(c);
        System.out.println(a*b/c);

    }

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }


}
