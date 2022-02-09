package 백준_1065_한수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int count = 99;

        if(n < 100){
            count = n;
        } else {
            for(int i = 100; i <= n; i++){
                int a = i / 100;
                int b = (i % 100)/10;
                int c = (i % 100)%10;

                if(b - a == c - b){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

