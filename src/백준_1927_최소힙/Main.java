package 백준_1927_최소힙;

import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //PriorityQueue는 default값이 오름차순 -> Integer큐일 경우 작을수록 우선순위 높음음
       PriorityQueue<Integer> q = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                if(q.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(q.poll() + "\n");
                }
            } else {
                q.add(a);
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
