package 백준_1110_더하기사이클;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int count = 0;
        int result = n;

        while(true){
            n = ((n % 10) * 10) +(((n / 10)+(n % 10)) % 10);
            count++;

            if(result == n){
                break;
            }
        }
        System.out.println(count);
    }
}
