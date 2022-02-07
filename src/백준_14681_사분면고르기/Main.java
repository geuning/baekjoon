package 백준_14681_사분면고르기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if(a>0 && b>0){
            System.out.println("1");
        } else if(a<0 && b>0) {
            System.out.println("2");
        } else if (a<0 && b<0) {
            System.out.println("3");
        } else if (a>0 && b<0) {
            System.out.println("4");
        }


    }
}
