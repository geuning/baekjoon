package 백준_2884_알람시계;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();

        if((m - 45) < 0){
            if(h < 1){
                h = 23;
                m = m - 45 + 60;
            } else {
                h = h - 1;
                m = m - 45 + 60;
            }
        } else {
            m = m - 45;
        }

        System.out.println(h + " " + m);


    }
}
