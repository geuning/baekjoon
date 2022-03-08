package 백준_18258_큐2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int last = 0;

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push" :
                    last = Integer.parseInt(input[1]);
                    q.offer(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if(q.isEmpty()){
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(q.size() + "\n");
                    break;
                case "empty" :
                    if(q.isEmpty()){
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front" :
                    if(q.isEmpty()){
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(q.peek() + "\n");
                    }
                    break;
                case "back" :
                    if(q.isEmpty()){
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(last + "\n");
                    }
            }
        }
        bw.flush();
        bw.close();
    }
}
