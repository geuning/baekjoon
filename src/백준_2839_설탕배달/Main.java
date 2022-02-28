package 백준_2839_설탕배달;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n % 5 == 3 || n % 5 == 1){
            System.out.println((n / 5) + 1);
        } else if (n == 4 || n == 7){
            System.out.println(-1);
        } else if (n % 5 == 0){
            System.out.println(n / 5);
        } else if (n % 5 == 2 || n % 5 == 4){
            System.out.println((n / 5) + 2);
        }
    }
}
