package 백준_10773_제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        for(int i = 0; i < k; i++){
            int n = s.nextInt();
            if(n == 0){
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        int sum = 0;
        for (int t : stack){
            sum += t;
        }
        System.out.println(sum);
    }
}
